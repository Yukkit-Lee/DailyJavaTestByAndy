package InterfacePack;
/*
* 在任何版本java中，接口中都可以定义抽象方法
  public abstract 返回值类型 方法名称（参数列表）;
* */

//接口当中的抽象方法，修饰符必须为public abstract两个固定的关键字
//可选择性省略

public interface MyInterfaceAbstract {

    public abstract void Method();

    //public void Method02();

    //void Method03();

    //以上均为抽象方法，可选择性省略关键字
}
