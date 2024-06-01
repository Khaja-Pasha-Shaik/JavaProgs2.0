package Practice;

public class ImmutableClassImpl {

    public static void main(String[] args) {
        ImmutableClass1 i = new ImmutableClass1(10);
        ImmutableClass1 i2 = i.modify(100);
        ImmutableClass1 i3 = i.modify(10);

        System.out.println(i==i2); //false since points to diff location
        System.out.println(i==i3); //true points to same location
    }
}
