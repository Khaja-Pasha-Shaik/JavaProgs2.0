package singleton.reflectionBreak;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        
        SIngletonReflectionBreak sIngletonReflectionBreak = SIngletonReflectionBreak.getInst4();
        
        SIngletonReflectionBreak s3 = null;

        Constructor[] constructors = sIngletonReflectionBreak.getClass().getDeclaredConstructors();
        
        for (Constructor c : constructors){
            c.setAccessible(true);
            //To prevent this
            //From private constructor
            //If the object is already initialised - simply throw an exception
            s3 = (SIngletonReflectionBreak) c.newInstance();
        }

        //Prove hashcodes to be different to say objects are different
        System.out.println(sIngletonReflectionBreak.hashCode());
        System.out.println(s3.hashCode());
    }

    //To Prevent this from creating a new instance
    //Since we are getting all the declared constructors from the class and from there we are
    // creating a new instance

    //We will simply check add some check in the constructor as
    //If the object is already initialised - simply throw an exception
}
