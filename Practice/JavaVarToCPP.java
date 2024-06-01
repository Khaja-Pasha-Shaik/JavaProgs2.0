package Practice;

import java.util.Scanner;

public class JavaVarToCPP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if(s.contains("_")){
            convertToJavaVar(s);
        } else {
            convertToCPPVar(s);
        }
    }

    private static void convertToCPPVar(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i) < 97){
                sb.append('_');
                sb.append(Character.toLowerCase(s.charAt(i)));
            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }

    private static void convertToJavaVar(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '_'){
                sb.append(Character.toUpperCase(s.charAt(i+1)));
                i=i+1;
            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
