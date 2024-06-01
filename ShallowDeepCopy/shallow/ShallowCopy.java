package ShallowDeepCopy.shallow;

public class ShallowCopy implements Cloneable{

    private String name;

    private int id;

    ShallowCopy(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public ShallowCopy clone() throws CloneNotSupportedException {
        return  (ShallowCopy) super.clone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ShallowCopy{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
