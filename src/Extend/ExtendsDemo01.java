package Extend;

public class ExtendsDemo01 {

    public static void main(String[] args) {
        Employee e1 = new Employee(55);
        Student a1 = new Student();
        System.out.println("a1.systemAcc=" + a1.systemAcc + "\n" + "e1.systemAcc=" + e1.systemAcc);
        /*
         a1.systemAcc=0
         e1.systemAcc=55
         构造方法成员变量不可继承
         */

        a1.getNum();  //998
        a1.getSuperNum();  // 1 通过成员方法访问成员变量 该方法属于谁 就用谁的属性


        a1.sameNameMethod(); //同名方法，new了子类对象则优先使用子类方法

    }

}
