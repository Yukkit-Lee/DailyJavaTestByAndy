package Extend.ConstructorInEx;

public class Zi extends Fu{
    public Zi(){
        super();
        //子类构造方法中默认调用一个super()方法
        //super的父类构造调用，必须是子类构造的第一条语句，且不能多次调用super构造；
        System.out.println("子类构造方法调用！");
    }
}



//this访问本类内容
//this(...)；调用 即调用本类的构造方法，必须是构造方法的第一句也是唯一一个
//this和super两种构造调用，不能同时使用
