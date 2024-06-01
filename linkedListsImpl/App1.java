package linkedListsImpl;

public class App1 {

    public static void main(String[] args) {
        LinkedListImpl<Integer> ll = new LinkedListImpl<>();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.insertAtStart(0);
        ll.insertAtIndex(1,5);
        ll.insertAtIndex(3,15);
        ll.insertAtIndex(5,25);
        ll.remove(1);
        ll.show();
    }
}
