package Practice;

public final class ImmutableStudent {

    //Immutable means
    //Once object is created it cant be modified
    //Make fields final and we will only initialise once
    //Remove setters as well - so that we cannot set values for the fields
    //Class should also be final or else some other class can extend and modify its properties

    private final String name;

    ImmutableStudent(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
