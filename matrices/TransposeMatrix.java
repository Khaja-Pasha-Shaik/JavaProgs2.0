package matrices;

import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Enter m: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter elements:  ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("------------------------------");
        printMatrix2(arr);
        System.out.println("------------------------------");

        doMatrixTranspose(arr);
    }

    private static void printMatrix2(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void doMatrixTranspose(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("------------------------------");
        System.out.println("Printing the Transpose matrix");
        printMatrix2(arr);
        System.out.println("------------------------------");
    }
}
