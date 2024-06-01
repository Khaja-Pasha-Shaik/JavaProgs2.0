package linkedListsImpl.sll;

public class DeleteNthNode {

    static SLLNode head;

    public static void main(String[] args) {
        SLLNode s1 = new SLLNode(3);
        SLLNode s2 = new SLLNode(6);
        SLLNode s3 = new SLLNode(9);
        SLLNode s4 = new SLLNode(4);
        SLLNode s5 = new SLLNode(2); //Till here odd length
        SLLNode s6 = new SLLNode(8); //Till here even length, should give the next one

        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;
        head = s1;
        int k = 3;//Node tp be deleted from the end
//        deleteKthNode(s1,k);
        print(head);
        deleteKthNodeOptimal(s1,k);

    }

    private static void deleteKthNodeOptimal(SLLNode s1, int k) {
        SLLNode fast = s1;
        for(int i=0;i<k;i++){
            fast = fast.next;
        }
        SLLNode slow = s1;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println("******************");
        System.out.println("Fast Data "+fast.data);
        System.out.println("Slow data "+ slow.data);
        slow.next = slow.next.next;
        print(head);
    }

    private static void deleteKthNode(SLLNode s1, int k) {
        //Brute
        //Traverse - find length
        //Then traverse till n-k delete the node pointing
        SLLNode iter = head;
        int len = 0;
        while(iter != null){
            iter = iter.next;
            len++;
        }
        iter = head;
        for(int i=0;i<len-k-1;i++){
            iter = iter.next;
        }
        iter.next = iter.next.next;
    }

    //Optimal
    //take 2 pointers
    //fast and slow, fast will assign till the k, and then will start and slow by one step only
    //by the time fast reaches the end, slow will be at kth node


    //print function for LL
    public static void print(SLLNode head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}
