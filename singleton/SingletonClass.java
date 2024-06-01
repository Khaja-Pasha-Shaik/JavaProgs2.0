package singleton;

public class SingletonClass {

    //For a normal class like employee
    //Employee e1 = new Employee(); //will take an object in heap mem and e1 points to that
    //Employee e2 = e1; //Then e2 and e1 will point to same object
    //Employee e3 = new Employee(); //now e3 will point to new object

    //but for singleton, how many new objects you create it will point to the same reference in heap

    //1. you should restrict user to get access to constructor so that he cannot create obj
    // Therefore, you make it private
    //2. Create a method by which you create an object for the first time
    // It should give the existing one, from the next asks

    private static SingletonClass obj;

    private SingletonClass(){

    }

    public static SingletonClass getInst(){
        //This is lazy creation. When someone calls this method
        //Only then the object is created for this class. Till then obj is not created for the class
        if(obj == null){
            obj = new SingletonClass();
        }
        return obj;
    }


    //But if you see, if the above is accessed by threads, then there might be a possibility
    //that object is created twice, hence make the shared code into synchronised block and
    //make the obj volatile, so that it is flushed to the shared memory between the threads

    //Like this

    private static volatile SingletonClass obj2;

    //Constructor is already there above

    public static SingletonClass getInst2(){
        synchronized (SingletonClass.class){
            if(obj2 == null){
                obj2 = new SingletonClass();
            }
        }
        return obj2;
    }

    //But still our singleton class is breakable. Meaning we can create multiple instances for this class
    //1. By using cloning. Specifically using the clone() method
    //2. By using Reflection concept
    //3. By serializing and deserializing the object

}
