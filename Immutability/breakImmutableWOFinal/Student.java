package Immutability.breakImmutableWOFinal;

public class Student {

    //Here intentionally the class is not marked as final to break immutability

    private final String name;

    Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
