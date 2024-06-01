package Practice;

import java.util.ArrayList;
import java.util.List;

public class StringPerm3 {

    public static void main(String[] args) {

        String str = "abc";

        List<String> permutations = generatePermutation(str);

        System.out.println(permutations);
    }

    private static List<String> generatePermutation(String str) {
        List<String> premutations = new ArrayList<>();
        generatePermutationHelper(str,"",premutations);
        return premutations;
    }

    private static void generatePermutationHelper(String str, String currentPermutaion, List<String> premutations) {
        //base case: if permutation is of same length as of string
        if(currentPermutaion.length() == str.length()){
            premutations.add(currentPermutaion);
            return;
        }
        //generate perm for each character
        for(int i=0;i<str.length();i++){
            if(currentPermutaion.contains(String.valueOf(str.charAt(i)))){
                continue;
            }
            generatePermutationHelper(str,currentPermutaion+str.charAt(i),premutations);
        }
    }
}
