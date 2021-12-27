package Polymorphism;

/*
* 1.对象的向上转型，其实就是多态写法
* Animal obj=new Cat();
* 含义：右侧创建一个子类对象，把他当做父类来看待使用
* (创建一只猫，把猫当做动物来看待使用)
* 注意事项：向上转型一定是安全的。从小范围转向了大范围   （int -> double   Cat -> Animal）
* 对象一旦向上转型为父类，那么就无法调用子类原本特有的内容
*
*/

/*
* 2.对象的向下转型，其实就是一个【还原】动作（解决多态中访问不到子类特有方法的问题）
* 格式： 子类名称 对象名 =(子类名称) 父类对象 ；
* 含义： 将父类对象，【还原】成为本来的子类对象
*
* Animal obj=new Cat(); //本来是猫，向上转型为动物
* Cat cat=(Cat)obj;  //本来是猫，已经是被当成动物了，【还原】为猫
* 注意事项：必须保证对象本来创建的时候就是猫，才能向下转型成为猫
*         如果对象创建的时候不是猫，强制向下转型成猫，则会报错
*/

public class Demo02 {
    public static void main(String[] args) {
        Animal obj=new Cat();
        obj.eat();
        //obj.catchMouse();  访问不到子类特有方法，需向下转型
        Cat obj2=(Cat) obj;
        obj2.catchMouse();

        System.out.println("====attention====");

        Dog obj3=(Dog)obj;//编译不报错，运行报错：ClassCastException 类转换异常
        //class Polymorphism.Cat cannot be cast to class Polymorphism.Dog
    }

}
