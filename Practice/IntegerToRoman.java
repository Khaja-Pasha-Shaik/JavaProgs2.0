package Practice;

public class IntegerToRoman {

    //ask for max value that can be given

    public static void main(String[] args) {
        int n = 1354;
        int a = 'a';
        System.out.println(a);
        System.out.println(n/1000);
        System.out.println((n%1000)/100);
        System.out.println((n%100)/10);
        System.out.println(n%10);
    }
}
