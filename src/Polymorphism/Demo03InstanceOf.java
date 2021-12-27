package Polymorphism;

/*
 * 如何才能知道一个父类引用的对象，本来是什么子类
 * 格式：
 * 对象 instanceof 类名称
 * 返回值为boolean类型，判断前面的对象能不能做右侧类型的实例
 *
 * */
public class Demo03InstanceOf {
    public static void main(String[] args) {
        Animal obj = new Cat();
        obj.eat();

        //如果需要用到子类特有方法，需要向下转型
        //判断父类引用obj本来是不是Dog
        if (obj instanceof Dog) {
            Dog obj2 = (Dog) obj;
            obj2.shout();
        }
        //判断父类引用obj本来是不是Dog
        if (obj instanceof Cat) {
            Cat obj3 = (Cat) obj;
            obj3.catchMouse();
        }
    }
}
