package matrices;

import java.util.Scanner;

public class MatrixMultiplication {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Enter n1, m1 :: ");
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        System.out.println("Enter n2, m2 :: ");
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();

        System.out.println("Enter matrix-1 elements :: ");
        int[][] arr1 = fillMatrix(n1,m1);
        System.out.println("Enter matrix-2 elements :: ");
        int[][] arr2 = fillMatrix(n2,m2);

        System.out.println("Printing matrix-1 :: ");
        printMatrix(arr1);
        System.out.println("Printing matrix-2 :: ");
        printMatrix(arr2);

        System.out.println("Multiply matrices");
        //base condition
        if(m1 != n2){
            System.out.println("Matrix Multiplication :: Not Possible");
            return;
        }

        performMultiplication(arr1,arr2,n1,m1,n2,m2);
    }

    private static void performMultiplication(int[][] arr1, int[][] arr2, int n1, int m1, int n2, int m2) {
        int[][] arr3 = new int[n1][m2];
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[0].length;j++){
                //Result at particular place in the resultant matrix is, lets say 2nd rowth and 3rd col element
                //C23 = a21 x b13 + a22 x b23 + a23 x b33
                //If you see carefully the resultant matrix row is same for a
                //like for c|2|3 = a21,a22,a23 is involved i.e., rowth place of a is always having 2
                //and c23 = b13,b23,b33 i.e., col place 3 is common w.r.t c2|3|
                for(int k=0;k<n1;k++){
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
    }

    private static void printMatrix(int[][] arr) {
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
    }

    private static int[][] fillMatrix(int n, int m) {
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }


}
