package linkedListsImpl.dll;

public class DLLNode {

     DLLNode previous;
      int data;
     DLLNode next;

    DLLNode(int data){
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    DLLNode(DLLNode previous, int data, DLLNode next){
        this.previous = previous;
        this.data = data;
        this.next = next;
    }
}
