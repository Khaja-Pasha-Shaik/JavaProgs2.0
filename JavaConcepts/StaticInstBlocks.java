package JavaConcepts;

public class StaticInstBlocks {

    static int i;
    static {
        System.out.println("This is a static block -1 ");
    }

    int j;
    {
        System.out.println("This is an Inst block -1");
    }

    void meth(){
        System.out.println("Inside the method");
        System.out.println("val i::"+i+"   val j::"+j);
    }

    public StaticInstBlocks(){
        System.out.println("Inside Constructor");
//        i=10;
//        j=2;
    }

    static{
        System.out.println("static block - 2");
        i = 11;
    }

    {
        System.out.println("Instance block - 2");
        j = 3;
        i=13; // static var seems to get initialised from inst block as well
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        StaticInstBlocks sib = new StaticInstBlocks();
        sib.meth();
    }
}
