package Practice;

import java.util.HashSet;
import java.util.Set;

public class StringAllAlphabets {

    public static void main(String[] args) {

        //All alphabets
        //1. lets make the string to lower case
        //2. Add everything to a set. Before adding check if it is a valid letter
        //3. Then at last if size is 26 then return true

        String str = "abcd bcdefghijklmnopqrstuvwxyz2351";
        Set<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                set.add(ch);
            }
        }

        System.out.println(set.size()==26);

        anotherMethod(str);
    }

    private static void anotherMethod(String str) {

        boolean[] alphabets = new boolean[26];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                alphabets[ch-'a'] = true;
            }
        }

        for(boolean b : alphabets){
            if(!b){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
