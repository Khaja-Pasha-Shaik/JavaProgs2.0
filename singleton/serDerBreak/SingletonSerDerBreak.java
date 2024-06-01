package singleton.serDerBreak;

import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class SingletonSerDerBreak implements Serializable {

    //This is breakable by Serializing and De-Serializing
    //To make this serialize implement serializable interface

    private static SingletonSerDerBreak obj;

    private SingletonSerDerBreak(){

    }

    //Need this method to protect it from someone to serialize and de-serialize and create a clone
    //With this - it will make the hashcodes similar
    @Serial
    protected Object readResolve(){
        return obj;
    }

    public static SingletonSerDerBreak getInst5(){
        if(obj == null){
            obj = new SingletonSerDerBreak();
        }
        return obj;
    }
}
