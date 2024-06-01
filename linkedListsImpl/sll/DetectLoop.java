package linkedListsImpl.sll;

import java.util.HashMap;
import java.util.Map;

public class DetectLoop {

    static SLLNode head;

    public static void main(String[] args) {
        SLLNode s1 = new SLLNode(3);
        SLLNode s2 = new SLLNode(6);
        SLLNode s3 = new SLLNode(9);
        SLLNode s4 = new SLLNode(4);
        SLLNode s5 = new SLLNode(2);

        // 3   6   9   4    2
        //         |________|

        //Lets add loop between 9 to 2
        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s3;  //This is the loop creator

        head = s1;
        boolean res = detectLoopinSLL(head);  //Brute approach
        System.out.println(res);

        //Optimal approach
        //Take the fast and slow pointers
        //Fast move by 2 steps, slow by 1 step
        //If they collide at any point -> return true saying there is a loop

        boolean res2 = tortoiseDetectLoop(head);
        System.out.println(res2);
    }

    private static boolean tortoiseDetectLoop(SLLNode node) {
        //Initialise pointers
        SLLNode slow = node;
        SLLNode fast = node;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    private static boolean detectLoopinSLL(SLLNode head) {
        //Traverse and insert into map
        //If it is found in the map - then break and return true, that we have a loop
        int i=0;
        Map<SLLNode, Integer> map = new HashMap<>();

        while(head != null){
            if(map.containsKey(head)){
                return true;
            }
            map.put(head,i);
            head = head.next;
            i++;
        }

        return false;
    }
}
