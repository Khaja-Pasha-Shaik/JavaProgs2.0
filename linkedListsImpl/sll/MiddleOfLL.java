package linkedListsImpl.sll;

public class MiddleOfLL {

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

        //Brute approach
        //Traverse through LL - get the length
        //Now traverse till (length/2)+1 and return the element

        bruteMiddle(s1);

        //Optimised - Tortoise or Hare traversal
        //Here we will make use of 2 pointers - fast and slow
        //fast moves 2 steps, slow moves one step
        //Intuition is lets say we have 2 persons walking at speed of x to cover distance d
        //But one person is twice the pace of the other
        //So within x time person-1 covers 'd' distance
        //Since person-2 is slow he can cover 'd/2' distance only

        tortoiseMiddle(s1);

    }

    private static void tortoiseMiddle(SLLNode head) {
        //Both pointers point at head on start
        SLLNode slow = head;
        SLLNode fast = head;
        // 2 3 5 6 7
        // 2(s,f) 3 5 6 7
        // 2 3(s) 5(f) 6 7
        // 2 3 5(s) 6 7(f)
        //The above is a case for odd length the fast pointer can reach the last node

        // 2 3 5 6 7 9
        // 2(s,f) 3 5 6 7 9
        // 2 3(s) 5(f) 6 7 9
        // 2 3 5(s) 6 7(f) 9
        // 2 4 5 6(s) 7 9 -> null(f)
        //This is the case for even length, it will crossover the last node but will not point
        //Hence while loop to check for |  fast != null && fast.next != null
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data); //slow will be at half
    }

    private static void bruteMiddle(SLLNode head) {
        SLLNode temp = head;
        if(head == null){
            return;
        }
        int len = 0;
        while(head != null){
            len += 1;
            head  = head.next;
        }
        int midlle = (len/2)+1;
        while(midlle-1 > 0){
            temp = temp.next;
            midlle--;
        }
        System.out.println("Middle element is ::"+temp.data);
    }
}
