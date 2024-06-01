package Practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonApp2 {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        SingletonPractice2 singletonPractice2 = SingletonPractice2.getInst2();

        SingletonPractice2 s2=null;

        System.out.println(singletonPractice2.hashCode());

        Constructor[] constructors = singletonPractice2.getClass().getDeclaredConstructors();

        for(Constructor cons : constructors){
            cons.setAccessible(true);
            s2 = (SingletonPractice2) cons.newInstance();
        }


        System.out.println(s2.hashCode());
    }
}
