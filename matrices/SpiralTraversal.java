package matrices;

import java.util.Scanner;

public class SpiralTraversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Enter m: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter elements :: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        doSpiralTraversal(arr);
    }

    private static void doSpiralTraversal(int[][] arr) {
        //Each spiral traversal can be taken as a box
        //each box has left, bottom, right, top wall
        //left -> col will remain same(minc), rows will vary(minr, maxr)
        //bottom -> row will remain same(maxr), col will vary(minc, maxc)
        //right -> col will remain same(maxc), rows will vary(maxr, minr)
        //top -> row will remain same(minr), cols will vary(maxc, minc)

        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;

        int te = arr.length * arr[0].length;
        int count = 0;
        //maintain count, it should be equal to the total no.of elements
        //to break out of while

        while (count < te){
            //left wall
            for(int i=minr,j=minc;i<=maxr;i++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minc++;

            //bottom wall
            for(int i=maxr,j=minc;j<=maxc;j++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            maxr--;

            //right wall
            for(int i=maxr,j=maxc;i>=minr;i--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            maxc--;

            //top wall
            for(int i=minr,j=maxc;j>=minc;j--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minr++;
        }
    }
}
