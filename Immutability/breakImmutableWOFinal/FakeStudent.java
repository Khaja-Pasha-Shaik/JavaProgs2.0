package Immutability.breakImmutableWOFinal;

public class FakeStudent extends Student{

    private String fakeName;

    FakeStudent(String name) {
        super(name);
        this.fakeName = name;
    }

    public String getFakeName() {
        return fakeName;
    }

    public void setFakeName(String fakeName) {
        this.fakeName = fakeName;
    }
}
