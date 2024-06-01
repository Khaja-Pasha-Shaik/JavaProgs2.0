package Practice;

import java.util.Stack;

public class BalancedBrackets {
    //Checking if every type of bracket has an equivalent closing bracket
    //( with this )
    //{ with this }
    public static void main(String[] args) {

        String str = "[(a+b)+{(c+d)}]";

        //take a stack
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            } else if(ch == ')'){
                if(stack.size() == 0){
                    System.out.println("not balanced");
                    break;
                } else if(stack.peek() != '('){
                    System.out.println("not balanced");
                    break;
                } else {
                    stack.pop();
                }
            } else if(ch == ']'){
                if(stack.size() == 0){
                    System.out.println("not balanced");
                    break;
                } else if(stack.peek() != '['){
                    System.out.println("not balanced");
                    break;
                } else {
                    stack.pop();
                }
            } else if(ch == '}'){
                if(stack.size() == 0){
                    System.out.println("not balanced");
                    break;
                } else if(stack.peek() != '{'){
                    System.out.println("not balanced");
                    break;
                } else {
                    stack.pop();
                }
            }
        }
    }
}
