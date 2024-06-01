package linkedListsImpl;

public class LinkedListImpl<E> {

    Node head;

    class Node{
        private E data;
        private Node next;
    }

    //add method - inserts at the end
    public void add(E data){
        Node insertNode = new Node();
        insertNode.data = data;
        insertNode.next = null;
        if(head == null){
            head = insertNode;
        }
        else{
            Node itern = head;
            //travel till end
            while(itern.next != null){
                itern = itern.next;
            }
            itern.next = insertNode;
        }
    }

    //insertAtStart
    public void insertAtStart(E data){
        //To insert at start
        //Just take whatever is in head, and assign it to the new insertNode's next
        //And insert the new address to head
        Node newInsertNode = new Node();
        newInsertNode.data = data;
        newInsertNode.next = head;
        head = newInsertNode;
    }

    //insertAtIndex
    public void insertAtIndex(int index, E data){
        //Lets say 2 is the index
        //We need to get to its before index and assign to our newNodes next
        //And that our newNodes next is to be whats there in the beforeIndex's next
        Node newInsertNode = new Node();
        newInsertNode.data = data;
        Node itern = head;
        for(int i =0;i<index-1;i++){
            itern = itern.next;
        }
        //Now I have the before index
        Node beforeAdd = itern.next;
        itern.next = newInsertNode;
        newInsertNode.next = beforeAdd;
    }

    //remove method
    public void remove(int index){
        //go to the index
        //as soon as you reach the before node
        //insert its next with the next in your gettingDeletedNode
        Node itern = head;
        for(int i =0;i<index-1;i++){
            itern = itern.next;
        }
        itern.next = itern.next.next;
    }

    //show method
    public void show(){
        Node itern = head;
        while(itern.next != null){
            System.out.println(itern.data);
            itern = itern.next;
        }
        System.out.println(itern.data);
    }
}
