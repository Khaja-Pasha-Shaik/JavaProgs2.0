package ShallowDeepCopy.deep;

public class AddressDeep implements Cloneable{

    private String city;

    private  String state;

    AddressDeep(String city, String state){
        this.city = city;
        this.state = state;
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
        return "AddressDeep{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public  AddressDeep clone() throws CloneNotSupportedException {
        return (AddressDeep) super.clone();
    }
}
