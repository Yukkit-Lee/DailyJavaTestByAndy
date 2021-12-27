package InterfacePack;

public class Demo02 implements InterfaceConst{
    public static void main(String[] args) {
        ImplementClass a=new ImplementClass();
        a.Method(); //实现类中覆盖重写的抽象方法 优先级 > 接口中定义的默认方法
                    //
        a.Method2();
        InterfaceConst.Method03(); //接口中的静态方法应用接口名称进行调用，不能通过实现类调用


        Zi ziw=new Zi();
        ziw.Method02();  //一个类如果直接用父类中的方法，和接口中的默认方法产生冲突，优先使用父类当中的方法
    }
}


/*

* 1.类与类之间是单继承的，直接父类只有一个。
* 2.类与接口之间是多实现的。一个类可以实现多个接口。
* 3.接口与接口之间是多继承的。
*
* 多个父接口中的抽象方法重复没关系，但如果是默认方法重复，则子接口需要进行覆盖重写(带default关键字)
* */