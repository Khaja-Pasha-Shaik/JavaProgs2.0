package Immutability.immutableWithMutableObj;

public class ImmutableWithMutableObjApp {

    public static void main(String[] args) {
        MutableAddress address1 = new MutableAddress("Bglr","krntk");
        ImmutableWithMutableObj immutableWithMutableObj = new ImmutableWithMutableObj("ravi",address1);

        //Since MutableAddress is a mutable obj
        //You can edit the city and state

        immutableWithMutableObj.getAddress().setCity("Hyd");
        immutableWithMutableObj.getAddress().setState("Telgn");

        System.out.println(immutableWithMutableObj); //Here you can see the edited address

        //change-1
        //To correct this scenario, that make Address also immutable
        //We can use, whenever a getAddress is called - a new object should be returned

        System.out.println(immutableWithMutableObj); //Here you cant see the edited address
        //Because you created a new obj when asked

        //change-2
        //But thats not recommended, instead have a copy constructor in address
        //Because any addition of parameter to the Address class will result in to change the
        // ImmutableWithMutableObj class

        System.out.println(immutableWithMutableObj); //Here you cant see the edited address
    }
}
