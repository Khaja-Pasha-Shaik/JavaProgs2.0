package Practice;

import java.util.Stack;

public class ValidateBrackets {
    //push everything
    //If you encounter a closing brace, pop until opening is found
    //Now if char is ) and stack peek has only ( then there was no expression in these braces
    //Hence redundant
    public static void main(String[] args) {

        String str = "((a+b)+((c+d)))";
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                //If there is nothing in between the braces, then they are redundant
                //If you can see if we have ( immediately after the ) encounter
                if(stack.peek() == '('){
                    System.out.println(true);
                    break;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        System.out.println(false);
    }
}
