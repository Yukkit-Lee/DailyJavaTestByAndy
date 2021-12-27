package Extend.Phone;

public class ExtendsDemo03 {
    public static void main(String[] args) {
        Phone a=new Phone();
        a.call();
        a.show();
        System.out.println("======");
        NewPhone b=new NewPhone();
        b.call();
        b.show();
    }
}
