package Polymorphism;

public interface testInterface {

    public abstract void Method();

    public static void staticMethod(){
        System.out.println("接口中的静态方法执行");
    }

    public default void defaultMethod(){
        System.out.println("接口中的默认方法执行!");
    }
}
