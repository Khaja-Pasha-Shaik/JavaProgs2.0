package Practice;

public class SingletonPractice implements Cloneable{

    private static SingletonPractice singletonPractice;

    private SingletonPractice(){

    }

    public static SingletonPractice getInst(){
        if(singletonPractice == null){
            singletonPractice = new SingletonPractice();
        }
        return singletonPractice;
    }

    @Override
    public SingletonPractice clone() throws CloneNotSupportedException {
        return (SingletonPractice) super.clone();
    }

}
