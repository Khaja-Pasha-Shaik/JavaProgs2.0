package ShallowDeepCopy;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student("ravi", 1);
        Student s2 = s1.clone();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
