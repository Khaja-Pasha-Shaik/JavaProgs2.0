import stackImpl.StackImpl;

import java.util.Stack;

public class BracketsDuplicacy {

    public static void main(String[] args) {

        String str = "(a+b)+((c+d))";

        Stack<Character> stack = new Stack<>();

        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                //Once we find a closing bracket, keep popping it until we find its open one
                while (stack.peek() != '('){
                    stack.pop();
                }
            } else{
                stack.push(ch);
            }
        }
        System.out.println(stack.toString());
    }
}
