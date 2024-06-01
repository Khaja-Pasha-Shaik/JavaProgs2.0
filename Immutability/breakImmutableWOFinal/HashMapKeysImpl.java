package Immutability.breakImmutableWOFinal;

import java.util.HashMap;

public class HashMapKeysImpl {

    //Now lets use our Immutable class as a HashMap key
    //All HashMap keys are immutable in general, because you will see what can happen

    public static void main(String[] args) {

        HashMap<Student, String> map = new HashMap<>();
        Student student1 = new Student("ravi");
        Student student2 = new Student("shiva");

        map.put(student1,"name1");
        map.put(student2,"name2");

        map.forEach((k,v) -> {
            System.out.println(k+", "+v);
        });

        System.out.println(map.get(student1)); //If you see here
        //I am able to get the value[ravi] by passing the student1 reference which is the key

        //Lets disrupt the mechanism
        FakeStudent fakeStudent = new FakeStudent("ravi2");
        student1 = fakeStudent;

        System.out.println(map.get(student1)); //Here it is printing null
        //Since student is modified, and actually it cant be done because the immutable classes
        //are marked as final for this reason
    }
}
