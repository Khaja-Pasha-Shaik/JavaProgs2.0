package stackImpl;

public class StackApp {

    public static void main(String[] args) {

        StackImpl stack = new StackImpl();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int peek = stack.peek();
        System.out.println("PEEK IS ::: "+peek);

        System.out.println("POP is :: "+ stack.pop());

        stack.show();
    }
}
