package Extend;

public class Student extends Employee {
    int myNum = 998;

    public Student (){
    }

    public void getNum() {
        System.out.println(myNum);
    }

    public void sameNameMethod(){
        System.out.println("子类方法执行！");
    }

}
