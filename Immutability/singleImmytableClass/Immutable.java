package Immutability.singleImmytableClass;

public final class Immutable {

    //Immutability is - once object is created, it cannot be changed
    //Steps to make a class immutable
    //1. Make fields as final, because once initialised with constructor, they cant be modified
    //2. Remove all the setters, so that no one can have access to change them
    // even if you provide setter, no one can change its value, because its final
    // it is just that it doesn't make sense to provide a setter to a final var
    //3. Make class as final, so no other class can extend and change the properties

    private final String name;

    Immutable(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
