package Practice;

final public class ImmutableClass1 {

    private int i;

    ImmutableClass1(int i){
        this.i = i;
    }

    public ImmutableClass1 modify(int i){
        if(i == this.i){
            return this;
        } else {
            return new ImmutableClass1(i);
        }
    }
}
