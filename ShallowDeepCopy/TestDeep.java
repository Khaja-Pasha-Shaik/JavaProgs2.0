package ShallowDeepCopy;

public class TestDeep {

    public static void main(String[] args) throws CloneNotSupportedException {

        //Proof that its a shallow copy only
        //Even if you change a copied address value i.e., in s2
        //Its changing the original value - address value in s1

        //To apply deep copy - make sure address also implements cloneable
        //Override clone method in both Student and Address classes
        //Address class will have default impl of clone method
        //Student will be having something else now

        //Proof. Now even if you change the address in s2
        //It should not affect the s1's address
        //Because s2 will have a separate copy and hashcode will also be different

        Address a3 = new Address("Mumbai","Maharashtra");
        StudentDeep s3 = new StudentDeep("sanjay",3,a3);
        StudentDeep s4 = (StudentDeep) s3.clone();
        s4.getAddress().setCity("Delhi");
        s4.getAddress().setCountry("Haryana");
        System.out.println(s3);
        System.out.println(s4);
    }
}
