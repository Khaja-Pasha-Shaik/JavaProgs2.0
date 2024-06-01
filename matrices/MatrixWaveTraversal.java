package matrices;

import java.util.Scanner;

public class MatrixWaveTraversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements :: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        doWaveTraversal(arr);
    }

    private static void doWaveTraversal(int[][] arr) {
        System.out.println("Wave Traversal is :: ");
        System.out.println();
        //In wave traversal - for every column row will change
        //as it either has to move up or down based on the previous direction
        //For up or down direction, we could simply take col and if even move down | if odd, move up

        //So taking cols on the outer loop
        for(int j=0;j<arr[0].length;j++){
            if(j%2 == 0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j]+"  ");
                }
            } else {
                for (int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+"  ");
                }
            }
        }
    }
}
