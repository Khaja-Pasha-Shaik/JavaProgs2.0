package Practice;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class PalindromesOfStrong {

    public static void main(String[] args) {
        String s = "aab";
        List<Character> ds = new ArrayList<>();
        funcPalin(s, ds, 0,s.length()-1);
    }

    private static void funcPalin(String s, List<Character> ds, int ind, int l) {
        if(ind > l){
            if(palindromeCheck2(ds.stream().map(String::valueOf).collect(Collectors.joining()))){
                System.out.println(ds.stream().map(String::valueOf).collect(Collectors.joining()));
            }
//            System.out.println(ds.stream().map(String::valueOf).collect(Collectors.joining()));
            return;
        }
        //pick
        ds.add(s.charAt(ind));
        funcPalin(s, ds, ind+1, l);

        //not pick
        ds.removeLast();
        funcPalin(s,ds,ind+1,l);
    }

    private static boolean palindromeCheck2(String collect) {
        boolean res = recurPalin(collect, 0, collect.length()-1);
        return res;
    }

    private static boolean recurPalin(String collect, int l, int r) {
        if(collect.equals("")){
            return true;
        }
        if(collect.length() == 1){
            return true;
        }
        if(collect.charAt(l) != collect.charAt(r)){
            return false;
        }
        if(l>r){
            return true;
        }
        return recurPalin(collect, l+1, r-1);
    }
}
