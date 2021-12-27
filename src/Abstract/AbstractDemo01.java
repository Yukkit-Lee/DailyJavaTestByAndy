package Abstract;

public class AbstractDemo01 {
    public static void main(String[] args) {
        //Animal a=new Animal();

        //不能直接new创建抽象类对象
        //必须用一个子类来继承抽象父类
        //子类中必须覆盖重写父类中所有的抽象方法
        //覆盖重写（实现）：子类对象去掉抽象方法的abstract关键词，补上方法体大括号

        Cat myCat=new Cat();
        myCat.eat();
    }
}
