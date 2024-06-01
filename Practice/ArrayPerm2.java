package Practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayPerm2 {

    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2};
        boolean[] vis = new boolean[arr.length];

        List<Integer> ds = new ArrayList<>();

        generatePerms(arr,vis,ds);
    }

    private static void generatePerms(int[] arr, boolean[] vis, List<Integer> ds) {
        if(ds.size() == arr.length){
            System.out.println(ds);
            return;
        }
        for(int i=0;i<arr.length;i++) {
            if (!vis[i]) {
                //pick
                vis[i] = true;
                ds.add(arr[i]);
                generatePerms(arr, vis, ds);
                //not pick
                ds.removeLast();
                vis[i] = false;
            }
        }
    }
}
