package Immutability.immutableWithMutableObj;

public class MutableAddress {

    private String city;
    private String state;

    MutableAddress(String city, String state){
        this.city = city;
        this.state = state;
    }

    public MutableAddress(MutableAddress address) {
        this(address.getCity(), address.getState());
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "MutableAddress{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
