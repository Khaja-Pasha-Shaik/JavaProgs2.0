package sorting;

import java.util.Arrays;

public class BuubleSort {

    public static void main(String[] args) {

        int[] arr = new int[]{9,2,34,6,1,8};

        int[] arr2 = Arrays.copyOf(arr,arr.length);

        Arrays.stream(arr2).forEach(e -> System.out.print(e+"  "));

        //Bubble sort takes time of O(n^2)

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Using Arrays parallel sort method");
        Arrays.parallelSort(arr2); //THis is the fastest that uses threads to make it fast
        Arrays.stream(arr2).forEach(e -> System.out.print(e+"  "));
        System.out.println();
        Arrays.stream(arr).forEach(e -> System.out.print(e+"  "));
        System.out.println(Arrays.toString(arr));
    }
}
