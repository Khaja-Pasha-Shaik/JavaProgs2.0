import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByK {

    public static void main(String[] args) {
        //Rotation of array, String ... by the given number

        char[] charArr = new char[]{'a','b','c','d','e'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter K to rotate: ");
        int k = sc.nextInt();

        //Intuition is cut the array, so that you have K elements from the end
        //For example if k=3, the array cut will be
        //{'a','b'} and {'c','d','e'}
        //Now reverse 2 sub arrays they become {'b','a'} and {'e','d','c'}
        //Now join both and reverse
        //joining both -> {'b','a','e','d','c'}
        //reverse -> {'c','d','e','a','b'}

        //if K is greater than the length - you would face exception when charArr.length-k-1 conditions
        //are used
        //We can say that 5 rotations of a 5 length array will give us the same array
        //hence we can do modulo division for that

        k = k % charArr.length;

        if(k < 0){
            k = k + charArr.length;
        }

        reverseArr(charArr, 0, charArr.length-k-1);
        reverseArr(charArr, charArr.length-k, charArr.length-1);
        reverseArr(charArr, 0, charArr.length-1);

        System.out.println(Arrays.toString(charArr));
    }

    private static void reverseArr(char[] charArr, int li, int ri) {

        while(li<ri){
            char temp = charArr[li];
            charArr[li] = charArr[ri];
            charArr[ri] = temp;

            li++;
            ri--;
        }
    }
}
