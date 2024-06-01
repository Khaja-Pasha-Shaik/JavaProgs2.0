import java.util.Scanner;

public class Alternating01TriPrint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ender = 0;
        for(int i=0;i<n;i++){
            if(ender == 0){
                for(int j=0;j<=i;j++){
                    if(j%2 == 0){
                        System.out.print(0+" ");
                        ender = 1;
                    } else{
                        System.out.print(1+" ");
                        ender = 0;
                    }
                }
            } else{
                for(int j=0;j<=i;j++){
                    if(j%2 == 0){
                        System.out.print(1+" ");
                        ender = 0;
                    } else{
                        System.out.print(0+" ");
                        ender = 1;
                    }
                }
            }
            System.out.println();
        }
    }
}
