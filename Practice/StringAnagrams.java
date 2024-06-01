package Practice;

import java.util.Arrays;

public class StringAnagrams {
    //If both strings have same characters
    //But are scattered can form anagrams
    //listen & silent are anagrams

    public static void main(String[] args) {

        String s1 = "silent";
        String s2 = "listen";

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2));
    }
}
