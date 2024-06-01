package Practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayPerm {

    //This is not working

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3};

        List<List<Integer>> permutations = generateArrayPerms(arr);
        System.out.println(permutations);
    }

    private static List<List<Integer>> generateArrayPerms(int[] arr) {
        List<List<Integer>> permutations  = new ArrayList<>();
        List<Integer> currentPerm = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        generateArrayPermsHelper(arr,used,currentPerm,permutations);
        return permutations;
    }

    private static void generateArrayPermsHelper(int[] arr, boolean[] used, List<Integer> currentPerm, List<List<Integer>> permutations) {
        if(currentPerm.size() == arr.length){
            permutations.add(currentPerm);
            return;
        }

        //traverse through every element
        for(int i=0; i<arr.length; i++){
            if(used[i]){
                continue;
            }
            currentPerm.add(arr[i]);
            used[i] = true;
            generateArrayPermsHelper(arr, used, currentPerm,permutations);
            used[i] = false;
            currentPerm.removeLast();
        }
    }
}
