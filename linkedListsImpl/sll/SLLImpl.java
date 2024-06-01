package linkedListsImpl.sll;

public class SLLImpl {

    static SLLNode head;

    public static void main(String[] args) {

        int[] arr =new int[]{3,2,5,1,6,9};
        //Insert arr to a single linked list

        arrToSLL(arr);
        //pritn the ll
        printLL(head);

        //reverse a SLL
        //SLL has only a single pointer and we need to reverse that
        reverseSLL(head);


    }

    private static void reverseSLL(SLLNode head) {
        SLLNode previous = null;
        SLLNode temp = head;
        SLLNode front = null;
        //since we need to point the 1st element to point to null. Because in reverse this
        //becomes the last. We need to make it point to null
        //But if we do directly we cant get hold of the next element
        //Hence assign in front what is in the element
        //Order is previous -> head,temp -> front
        while (temp != null){
            //assigning this to make the temp point to previous
            front = temp.next;
            //Since reverse this should point to previous
            temp.next = previous;
            //follow up previous to temp
            previous = temp;
            //follow up temp to front
            temp = front;
        }
        System.out.println();
        printLL(previous);
    }

    private static void printLL(SLLNode head) {
        while (head != null){
            System.out.print(head.data+"  ");
            head = head.next;
        }
    }

    private static void arrToSLL(int[] arr) {
        SLLNode temp = new SLLNode(arr[0]);
        head = temp;
        for (int i=1;i<arr.length;i++){
            SLLNode node = new SLLNode(arr[i]);
            temp.next = node;
            temp = temp.next;
        }
    }
}
