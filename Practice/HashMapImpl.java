package Practice;

import java.util.Arrays;
import java.util.LinkedList;

public class HashMapImpl<K,V> {

    LinkedList<HMNode>[] buckets;
    int size;

    public class HMNode{
        private K key;
        private V value;

        HMNode(K key, V value){
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "HMNode{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    HashMapImpl(){
        size = 0;
        initBuckets(4);
    }

    private void initBuckets(int size) {
        buckets = new LinkedList[size];
        for(int i =0; i<size;i++){
            buckets[i] = new LinkedList<>();
        }
    }

    //put method
    //takes key, value
    //If key is there - it returns the value
    //Or else -> inserts at the end and returns null increment size

    public void put(K key, V value){
        int bi = hashFnc(key);
        //function to return something if its already there or return -1
        int di = checkIfThereInParticularBucket(bi , key);

        //if there
        if(di != -1){
            HMNode hmNodes = buckets[bi].get(di);
            hmNodes.value = value;
        } else{
            HMNode newHmNode = new HMNode(key, value);
            buckets[bi].add(newHmNode);
            size++;
        }
        double lambda = size * (1.0) / buckets.length;
        if(lambda > 2.0){
            rehash();
        }
    }

    private void rehash() {
        //we will create a hashmap of double its size now
        // get hold of all the previous elements
        LinkedList<HMNode>[] old = buckets;
        initBuckets(old.length * 2);
        size = 0;
        for(int i =0; i< old.length;i++){
            for(HMNode hmNode : old[i]){
                put(hmNode.key, hmNode.value);
            }
        }
    }

    public V get(K key){
        int bi = hashFnc(key);
        //function to return something if its already there or return -1
        int di = checkIfThereInParticularBucket(bi , key);

        //if there
        if(di != -1){
            HMNode hmNodes = buckets[bi].get(di);
            return hmNodes.value;
        } else{
            return null;
        }
    }

    //remove
    public V remove(K key){
        int bi = hashFnc(key);
        int di = checkIfThereInParticularBucket(bi, key);

        //if there
        if(di != -1){
            HMNode hmNodes = buckets[bi].get(di);
            buckets[bi].remove(hmNodes);
            size--;
            return hmNodes.value;
        } else {
            return null;
        }
    }

    private int checkIfThereInParticularBucket(int bi, K key) {
        int di =0;
        LinkedList<HMNode> currentBucket = buckets[bi];
        for (HMNode hmNode : currentBucket){
            if(hmNode.key.equals(key)){
                return di;
            }
            di++;
        }
        return -1;
    }

    private int hashFnc(K key) {
        int hash = key.hashCode();
        return Math.abs(hash) % buckets.length;
    }

    @Override
    public String toString() {
        return "HashMapImpl{" +
                "buckets=" + Arrays.toString(buckets) +
                '}';
    }
}
