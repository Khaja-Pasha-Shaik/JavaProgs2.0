package Practice;

public class EmployeeImpl {

    public static void main(String[] args) {
        Employee e1 = new Employee("ravi",1);
        Employee e2 = new Employee("ravi",1);

        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode() == e2.hashCode());
    }
}
