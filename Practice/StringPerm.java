package Practice;

import java.util.ArrayList;
import java.util.List;

public class StringPerm {

    public static void main(String[] args) {
        String str = "abc";
        List<Character> ds = new ArrayList<>();
        boolean[] vis = new boolean[str.length()];

        calculatePermString(str,vis,ds);
    }

    private static void calculatePermString(String str, boolean[] vis, List<Character> ds) {
        if(ds.size() == str.length()){
            System.out.println(ds);
            return;
        }
        for(int i=0;i<str.length();i++){
            if(!vis[i]){
                vis[i] = true;
                ds.add(str.charAt(i));
                calculatePermString(str,vis,ds);
                ds.removeLast();
                vis[i] = false;
            }
        }
    }
}
