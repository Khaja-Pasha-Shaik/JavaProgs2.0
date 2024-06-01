package matrices;

import java.util.Scanner;

public class ExitPointMatrix {

    //Matrix can only contain 0,1's
    //Every encounter of 1 will make the person moving to turn 90 degree to right
    //and 0's makes him move in the same direction

    //                 ^ north
    //        west <        > east
    //                 v south

    // every 90degree turn mean change in direction
    // Ultimately he will exit out of the matrix at somepoint, thats the output


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Enter m: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter elements:: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        String res = getTheExitPoint(arr);
        System.out.println(res);
    }

    private static String getTheExitPoint(int[][] arr) {

        //we can deduce that every addition of 1 to some variable we can change the direction
        //as the array can only contain 0,1's
        //Since we can only have 4 directions, if the var sum exceeds 4 do a modulo division by 4

        int direction = 0;
        int i=0; //start from 0,0
        int j=0;

        while (true){
            direction   = (direction +  arr[i][j]) % 4;

            if(direction == 0){ //moving east
                j++;
            } else if(direction == 1){ //moving south
                i++;
            } else if (direction == 2) { //moving west
                j--;
            } else if (direction == 3) { //moving north
                i--;
            }

            if(i < 0){ //negative row
                i++;
                break;
            } else if (i == arr.length) { //out of bound row
                i--;
                break;
            } else if (j < 0) { //negative col
                j++;
                break;
            } else if (j == arr[0].length) {  //out of bound col
                j--;
                break;
            }
        }

        String res = i + ", "+ j;
        return res;

    }
}
