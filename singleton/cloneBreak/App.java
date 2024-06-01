package singleton.cloneBreak;

import singleton.SingletonClass;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        //If we can prove both have different hashcodes
        //We can be sure that its a different object

        //To prevent the breaking of singleton
        //I have added the override to clone method in SingletonCloneBreak class
        //Now when you clone it - this will throw an exception

        SingletonCloneBreak s1 = SingletonCloneBreak.getInst3();
        System.out.println(s1.hashCode());
        SingletonCloneBreak s2 = (SingletonCloneBreak) s1.clone();


        System.out.println(s2.hashCode());
    }
}
