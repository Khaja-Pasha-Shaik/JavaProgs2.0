package singleton.serDerBreak;

import java.io.*;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SingletonSerDerBreak s1 = SingletonSerDerBreak.getInst5();

        //Serialize object to a file
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(s1);
        out.close();

        //De-Serialize the object now
        ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingletonSerDerBreak s2 = (SingletonSerDerBreak) in.readObject();
        in.close();

        //Proof that hashcodes are not equal. Hence diff objects
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //To prevent the breakage
        //Just override the readResolve method in the class which is implementing the
        //Serializable interface and return the same instance

    }
}
