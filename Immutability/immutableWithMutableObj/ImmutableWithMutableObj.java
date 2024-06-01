package Immutability.immutableWithMutableObj;

public final class ImmutableWithMutableObj {

    //1. Make variables final
    //2. Assign them from constructor
    //3. Remove all the setters
    //4. Make the class final

    //Now MutableAddress is a Mutable class
    //If you insert a Mutable obj in an Immutable class - the whole class will become Mutable
    //Because you can edit the address now

    private final String name;
    private final MutableAddress address;

    ImmutableWithMutableObj(String name, MutableAddress address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public MutableAddress getAddress() {
//        return address; //without any change
//        return  new MutableAddress(address.getCity(), address.getState());  // change-1
        return new MutableAddress(address);  //change-2 [recommended]
    }

    @Override
    public String toString() {
        return "ImmutableWithMutableObj{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
