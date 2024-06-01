package Practice;

public class SingletonApp1 {

    public static void main(String[] args) throws CloneNotSupportedException {

        //Breakable by cloning
        SingletonPractice s1 = SingletonPractice.getInst();

        SingletonPractice s2 = SingletonPractice.getInst();


        //Hashcodes diff means already breakable
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
