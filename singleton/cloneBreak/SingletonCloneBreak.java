package singleton.cloneBreak;

public class SingletonCloneBreak extends MyClone{

    //This can be now broken by cloning
    //Lets have a class called MyClone that implements Cloneable interface
    //And out class will extend MyClone, this can happen for business purposes
    //Whatever, a class can extend any class and that class can implement some interface. Possible

    private static SingletonCloneBreak obj;

    private SingletonCloneBreak(){

    }

    //To prevent the cloning of this singleton class, we will simply override and
    //throw an exception
    @Override
    public Object clone(){
        return new CloneNotSupportedException();
    }


    public static SingletonCloneBreak getInst3(){
        if(obj == null){
            obj = new SingletonCloneBreak();
        }
        return obj;
    }
}
