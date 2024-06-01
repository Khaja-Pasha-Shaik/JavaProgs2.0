package ShallowDeepCopy.deep;

public class DeepApp {

    public static void main(String[] args) throws CloneNotSupportedException {

        AddressDeep addressDeep = new AddressDeep("bglr","karnataka");
        StudentDeep studentDeep = new StudentDeep("ravi",1,addressDeep);

        StudentDeep s2 = studentDeep.clone();

        System.out.println(studentDeep); //should print ravi,1,bglr,karnataka
        System.out.println(s2); //should print ravi,1,bglr,karnataka

        s2.getAddress().setCity("hyd");
        s2.getAddress().setState("telangana");

        System.out.println(s2); //should print ravi,1,hyd,telangana
        System.out.println(studentDeep); //surprisingly main obj also gets modified to hyd and telagana

        //Lets make Address also to implement Cloneable

        System.out.println(s2); //should print ravi,1,hyd,telangana
        System.out.println(studentDeep); //surprisingly main obj also gets modified to hyd and telagana

        //Even after implement Cloneable - it still modifies the main obj
        //Add this to studentDeep obj
//        @Override
//        public StudentDeep clone() throws CloneNotSupportedException {
//            StudentDeep studentDeep = (StudentDeep) super.clone();
//            studentDeep.setAddress(address.clone());
//            return studentDeep;
//        }

        System.out.println(studentDeep); //Now it prints Karnataka and bglr

    }
}
