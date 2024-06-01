package Practice;

public class ShallowCopyApp {

    public static void main(String[] args) throws CloneNotSupportedException {

        ShallowCopy shallowCopy = new ShallowCopy("ravi",1);
        ShallowCopy s2 = shallowCopy.clone();

        System.out.println(shallowCopy);//this should print ravi,1
        System.out.println(s2); //should print ravi,1
        s2.setName("shiva");
        System.out.println(shallowCopy); // should still print ravi,1
        System.out.println(s2); //should print shiva,1

    }
}
