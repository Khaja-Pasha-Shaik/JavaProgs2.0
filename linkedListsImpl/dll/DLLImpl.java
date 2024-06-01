package linkedListsImpl.dll;

import java.util.Stack;

public class DLLImpl {

    static DLLNode head;

    public static void main(String[] args) {

        int[] arr = new int[]{3,2,4,1,5};

        DLLNode headAfterInsertion =  insertToDLL(arr);

        while (headAfterInsertion != null){
            System.out.print(headAfterInsertion.data+" ");
            headAfterInsertion = headAfterInsertion.next;
        }

        //reverse the DLL - Brute is use a stack
        System.out.println();
        Stack<Integer> stack = new Stack<>();
        System.out.println("Reversed DLL is :: ");
        System.out.println();
        reverseDLL(head, stack);

        //reverse DLL without a stack, reverse the connections everywhere
        //like at any node previous to next
        //next to previous

        reverseDLL2(head);
    }

    private static void reverseDLL2(DLLNode temp) {
        DLLNode swap = null;
        DLLNode newHead = null;
        while(temp != null){
            //Below 3 lines are simple swap
            //making previous to next and next to previous
            swap = temp.previous;
            temp.previous = temp.next;
            temp.next = swap;
            //To move forward, since you made previous to next and vice versa
            //to move forward you to need to do temp = temp.previous
            //which obviously translates to temp = temp.next
            temp = temp.previous;
        }
        newHead = swap.previous;
        System.out.println("**********************************");
        //print them
        while (newHead != null){
            System.out.print(newHead.data+ " ");
            newHead = newHead.next;
        }
    }

    private static void reverseDLL(DLLNode first, Stack<Integer> stack) {
        if(first == null){
            return;
        }
        //traverse through the DLL, and insert everything to stack
        while(first != null){
            stack.push(first.data);
            first = first.next;
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    private static DLLNode insertToDLL(int[] arr) {
        DLLNode d1 = new DLLNode(arr[0]);
        head = d1;
        DLLNode prev = head;
        for(int i=1;i<arr.length;i++){
            //create a new node every time, previous we have anyways as first element
            //next will be null for now, in the next iteration it will filled as previous.next
            DLLNode d = new DLLNode(prev,arr[i],null);
            //Yes so the previous next should be this node
            prev.next = d;
            //Go ahead with previous, or you can also do prev to point to d, as d is the new element
            //moving forward every iteration
            prev = prev.next;
        }
        return head;
    }
}
