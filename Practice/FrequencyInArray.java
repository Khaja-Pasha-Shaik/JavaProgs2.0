package Practice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyInArray {
    //Just give frequency of each element in an array

    public static void main(String[] args) {

        int[] arr = new int[]{2,3,4,2,5,7,8,3,2};

        Map<Integer,Long> map = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(e -> e,Collectors.counting()));


        System.out.println(map);
    }
}
