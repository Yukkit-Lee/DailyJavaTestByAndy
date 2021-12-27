package Polymorphism;

public class Zi extends Fu {

    public int num = 20;//子类不可以覆盖重写父类属性变量

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void Method() {
        System.out.println("子类方法！");
    }

    public void UniqueMethodInZi() {
        System.out.println("子类特有方法");
    }
}
