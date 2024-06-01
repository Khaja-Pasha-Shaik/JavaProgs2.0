package linkedListsImpl.sll;

public class ReverseLL {

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

        reverseaLL(s1);
    }

    private static void reverseaLL(SLLNode head) {
        SLLNode prev = null;
        SLLNode front;
        while (head != null){
            //preserve the next link in front
            front = head.next;
            //The next should point to previous, to reverse
            head.next = prev;
            //prev should move ahead
            prev = head;
            //head should move front
            head = front;
        }
        printLL2(prev);
    }

    private static void printLL2(SLLNode head) {

        while (head != null){
            System.out.print(head.data+"   ");
            head = head.next;
        }
    }
}
