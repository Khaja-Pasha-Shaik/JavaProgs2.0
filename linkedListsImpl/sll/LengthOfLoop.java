package linkedListsImpl.sll;

import javax.management.ObjectName;
import javax.net.ssl.SSLContext;
import java.util.HashMap;
import java.util.Map;

public class LengthOfLoop {

    public static void main(String[] args) {
        SLLNode s1 = new SLLNode(3);
        SLLNode s2 = new SLLNode(6);
        SLLNode s3 = new SLLNode(9);
        SLLNode s4 = new SLLNode(4);
        SLLNode s5 = new SLLNode(2);
        SLLNode s6 = new SLLNode(8);

        // 3   6   9   4    2    8
        //         |_____________|

        //Lets add loop between 9 to 8
        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;
        s6.next = s3;

        //Brute approach
        //Take map, insert the node and with some timer number
        //If you encounter the number again, then currentTime - timer in map can give you distance

        int res = calculateLengthBrute(s1);
    }

    private static int calculateLengthBrute(SLLNode head) {
        int timer =0;
        int encounter = 0;
        SLLNode sllNode = null;
        Map<SLLNode, Integer> map = new HashMap<>();
        while (head != null){
            if(!map.containsKey(head)){
                map.put(head, timer);
            } else {
                sllNode = head;
                encounter = timer;
                break;
            }
            timer++;
            head = head.next;
        }
        System.out.println("Length of Loop is ::"+Math.abs(encounter-map.get(sllNode)-1));
        return timer;
    }
}
