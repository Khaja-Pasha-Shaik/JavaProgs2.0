package Practice;

final public class StudentImmutable {

    private final int id;
    private  final String name;

    //make your fields final - so that they cannot be modified after object is
    //constructed

    public StudentImmutable(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StudentImmutable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
