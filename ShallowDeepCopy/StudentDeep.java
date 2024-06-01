package ShallowDeepCopy;

public class StudentDeep implements Cloneable{

    private String name;
    private  int id;
    private Address address;

    StudentDeep(String name, int id, Address address){
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public StudentDeep clone() throws CloneNotSupportedException {
        StudentDeep studentDeep = (StudentDeep) super.clone();
        studentDeep.setAddress((Address) address.clone());
        return studentDeep;
    }

    @Override
    public String toString() {
        return "StudentDeep{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}
