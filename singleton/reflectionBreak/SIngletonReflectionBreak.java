package singleton.reflectionBreak;

public class SIngletonReflectionBreak {

    //This class's singleton feature can be destroyed by reflection also

    private static SIngletonReflectionBreak obj;

    private SIngletonReflectionBreak(){
        if(obj != null){
            throw  new IllegalStateException("Instance cant be created");
        }
    }

    public static SIngletonReflectionBreak getInst4(){
        if(obj == null){
            obj = new SIngletonReflectionBreak();
        }
        return obj;
    }
}
