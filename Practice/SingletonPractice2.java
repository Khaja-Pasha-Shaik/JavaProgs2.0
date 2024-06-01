package Practice;

public class SingletonPractice2 {

    //Break with reflection

    private static SingletonPractice2 singletonPractice2;

    //To get rid of breaking through reflection
    private SingletonPractice2(){
        //add a check
        if(singletonPractice2 != null){
            throw new IllegalStateException("Object cant be created");
        }
    }

    public static SingletonPractice2 getInst2(){
        if(singletonPractice2 == null){
            singletonPractice2 = new SingletonPractice2();
        }
        return singletonPractice2;
    }
}
