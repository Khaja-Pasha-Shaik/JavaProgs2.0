package ShallowDeepCopy.deep;

public class StudentDeep implements Cloneable{


    private String name;

    private int id;

    private AddressDeep address;

    StudentDeep(String name, int id, AddressDeep address){
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AddressDeep getAddress() {
        return address;
    }

    public void setAddress(AddressDeep address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentDeep{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }

    @Override
    public StudentDeep clone() throws CloneNotSupportedException {
        StudentDeep studentDeep = (StudentDeep) super.clone();
        studentDeep.setAddress(address.clone());
        return studentDeep;
    }
}
