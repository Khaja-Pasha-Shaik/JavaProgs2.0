package Practice;

import java.io.Serial;
import java.io.Serializable;

public class SingletonPractice3 implements Serializable {

    private static SingletonPractice3 singletonPractice3;

    private SingletonPractice3(){

    }

    @Serial
    public Object readResolve(){
        return singletonPractice3;
     }

    public static SingletonPractice3 getInst3(){
        if(singletonPractice3 == null){
            singletonPractice3 = new SingletonPractice3();
        }
        return singletonPractice3;
    }
}
