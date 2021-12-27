package InterfacePack;

/*
 接口不能直接使用，需要有一个“实现类”来“实现”该接口
 public class 类名称 implements 接口名称{
   //...
 }

 接口的实现类必须要覆盖重写（实现）接口中的所有抽象方法

 如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类
*/


import java.lang.reflect.Method;

public class ImplementClass implements InterfaceConst,MyInterfaceAbstract{

    @Override
    public void Method(){
        System.out.println("覆盖重写Method()方法！");
    }

}
