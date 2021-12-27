package Polymorphism;

/*
 * 代码中体现多态性：父类引用指向子类对象
 *
 * 格式：
 *  父类名称 对象名= new 子类对象();
 *  接口名称 对象名= new 实现类名称();
 *
 * */
public class Demo01 {
    public static void main(String[] args) {
        //左侧父类的引用，指向了右侧子类的对象
        //父类引用子类对象
        Fu obj = new Zi();
        System.out.println(obj.getClass());
        obj.Method();

        System.out.println("================");


        testInterface obj2 = new ImplementsClass();
        obj2.Method();
        testInterface.staticMethod();
        obj2.defaultMethod();


        System.out.println("================");

        Fu obj3 = new Zi();
        System.out.println(obj3.num); //父类中的属性 -> 10
        obj3.showNum(); //子类中的方法  showNum（） -> 20
        //当子类对象赋值给父类引用变量时，通过引用变量访问对象成员时，
        //访问的行为方法是子类对象的覆盖方法，属性是父类的。

        System.out.println("================");

        Fu obj4=new Zi();
        obj4.UniqueMethodInFu();//在Zi类对象中找不到Uni..Infu()方法，向上查找到
        //obj4.UniqueMethodInZi(); 访问不到子类特有方法
        //如果方法有相应覆盖重写，优先使用子类中方法；子类中特有方法不能被访问到
        //多态对象只能调用父类的方法和成员变量，如果子类覆盖重写，优先调用子类对象
    }
}
