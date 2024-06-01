package Practice;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations2 {

    public static void main(String[] args) {

        String str = "abc";

        List<Character> ds = new ArrayList<>();

        funcPerm(str,ds,0, str.length()-1);
    }

    private static void funcPerm(String str, List<Character> ds, int ind, int length) {
        if(ind > length){
            ds.stream().forEach(c -> System.out.print(c+""));
            System.out.println();
            return;
        }
        //pick
        ds.add(str.charAt(ind));
        funcPerm(str,ds,ind+1,length);

        //not pick
        ds.removeLast();
        funcPerm(str,ds,ind+1, length);
    }
}
