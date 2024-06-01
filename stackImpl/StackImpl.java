package stackImpl;

import java.util.Arrays;

public class StackImpl {

    int[] stack = new int[4];
    int top=0;

    //push method
    public void push(int data){
        stack[top] = data;
        top++;
    }

    //pop method
    public int pop(){
        int res = stack[top-1];
        stack[top-1] = 0;
        top--;
        return res;
    }

    //stack peek
    public int peek(){
        return stack[top-1];
    }

    //show()
    public void show(){
        Arrays.stream(stack).forEach(System.out::println);
    }
}
