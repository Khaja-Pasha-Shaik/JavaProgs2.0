public class Recursion2 {
    static  int i = 1;
    public static void main(String[] args) {
        func2();
    }

    private static void func2() {
        if(i>5){
            return;
        }
        System.out.print(i+" ");
        i++;
        func2();
    }
}
