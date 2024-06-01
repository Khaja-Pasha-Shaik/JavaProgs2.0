public class Recursion1 {

    static  int count = 1;

    public static void main(String[] args) {
        int n=5;
        func();
    }

    private static void func() {
        if(count>5){
            return;
        }
        System.out.println("first prog");
        count++;
        func();
    }
}
