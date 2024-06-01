package hashmapImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class HashMapImpl<K, V>{

    class HMNode {
        K key;
        V value;

        @Override
        public String toString() {
            return "HMNode{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

        HMNode(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    private int size; //n
    private LinkedList<HMNode>[] buckets; //buckets.length = N

    HashMapImpl(){
        initBuckets(4);
        size = 0;
    }

    private void initBuckets(int N) {
        buckets = new LinkedList[N];
        for(int i=0; i<N;i++){
            buckets[i] = new LinkedList<>();
        }
    }

    //put
    public void put(K key, V value){
        int bi = hashFunc(key);
        int di = getIndexFromInsideBucket(bi, key);

        //already there
        if(di != -1){
            HMNode node = buckets[bi].get(di);
            node.value = value;
        } else{
            HMNode node = new HMNode(key, value);
            buckets[bi].add(node);
            size++;
        }
        //We might to check if we need a rehash or not after every insertion
        double lambda = size * (1.0) / buckets.length;
        if(lambda > 2.0){
            rehash();
        }
    }

    private void rehash() {
        LinkedList<HMNode>[] oldHm = buckets;
        initBuckets(oldHm.length * 2);
        size = 0; //As this new one has nothing
        //We made it zero because we will now call put for all the existing
        //And that has a increment on the size
        for(int i =0; i<oldHm.length; i++){
            for(HMNode hmNode : oldHm[i]){
                put(hmNode.key, hmNode.value);
            }
        }
    }

    //get method
    //get the bucket index
    //iterate through the LL at bucket index
    //If found return the value, if not return null
    public V get(K key){
        int bi = hashFunc(key);
        int di = getIndexFromInsideBucket(bi, key);
        //if found di will not be -1
        if(di != -1){
            return buckets[bi].get(di).value;
        } else {
            return null;
        }
    }

    //remove method
    //get bucket index
    //iterate through the LL got at bucket index
    //If found return value, remove it and decrement size
    //If not return null
    public V remove(K key){
        int bi = hashFunc(key);
        int di = getIndexFromInsideBucket(bi, key);
        //If we have it
        if(di != -1){
            HMNode hmNode = buckets[bi].get(di);
            buckets[bi].remove(hmNode);
            //Doesn't need to check rehash and deletion will inturn reduce the lambda
            size--;
            return hmNode.value;
        } else {
            return null;
        }
    }

    public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();
        for(int i=0; i<buckets.length;i++){
            for(HMNode hmNode : buckets[i]){
                keys.add(hmNode.key);
            }
        }
        return keys;
    }

    private int getIndexFromInsideBucket(int bi, K key) {
        int di =0;
        LinkedList<HMNode> ll = buckets[bi];
        for (HMNode hmNode : ll){
            if(hmNode.key.equals(key)){
                return di;
            }
            di++;
        }
        return -1;
    }

    public int size(){
        return size;
    }

    private int hashFunc(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    @Override
    public String toString() {
        return "HashMapImpl{" +
                "buckets=" + Arrays.toString(buckets) +
                '}';
    }
}
