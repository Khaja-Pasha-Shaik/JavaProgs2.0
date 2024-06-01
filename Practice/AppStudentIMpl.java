package Practice;

public class AppStudentIMpl {

    public static void main(String[] args) {
        StudentImmutable s = new StudentImmutable("ravi",2);
        //rn its not immutable - hence you chnage data and compare the hascodes

        System.out.println(s.hashCode());

        StudentImmutable s1 = new StudentImmutable("ravi",2);
//        s1.setId(3);  have to comment it because we removed the setter method
        //just changed the id

        System.out.println(s1.hashCode());
        System.out.println(s1); // Here you are able to change the id, making it mutable
        //Now lets make the Student class immutable
        //Remove the setter methods first so that - you wont have the ability to set the fields

        //Since you removed setters now, you still can change the values by
        //extending the class and overriding the if there is some method and change tye
        //functionality. In this example there is no such method final is not mandatory

        //1. Remove all teh setters
        //2. Make the fields final, so that they cannot be changed after
        //   object is constructed
        //3. Make the class final - Not mandatory

        StudentImmutable s2 = new StudentImmutable("ravi",2);
        System.out.println(s2.hashCode());
        System.out.println(s.equals(s1));
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());

    }
}
