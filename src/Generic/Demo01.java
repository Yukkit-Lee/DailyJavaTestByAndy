package Generic;

public class Demo01 {
    public static void main(String[] args) {
        GenericClass myGeneric=new GenericClass();
        myGeneric.setInfo("Object");
        System.out.println(myGeneric.getInfo()); //带有泛型的类，创建对象时不指定泛型默认则为object

        GenericClass<Integer> myIntGc=new GenericClass<>();
        myIntGc.setInfo(1);
        System.out.println(myIntGc.getInfo());

        GenericClass.method("String"); //此处为静态方法时，不建议创建对象使用
    }
}
