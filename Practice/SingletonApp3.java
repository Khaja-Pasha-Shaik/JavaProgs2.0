package Practice;

import java.io.*;

public class SingletonApp3 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SingletonPractice3 s1 = SingletonPractice3.getInst3();

        SingletonPractice3 s2 = null;

        //Serialize the obj
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("abc.ser"));
        out.writeObject(s1);
        out.close();

        //Deserialize
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("abc.ser"));
        s2 = (SingletonPractice3) in.readObject();
        in.close();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //To prevent this override read resolve method and return same onj
    }
}
