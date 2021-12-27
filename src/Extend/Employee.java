package Extend;

public class Employee {
    int systemAcc;
    String name;
    String sex;
    int myNum = 1;

    public Employee() {
    }

    public Employee(int systemAcc) {
        this.systemAcc = systemAcc;
    }

    public void getSuperNum() {
        System.out.println(myNum);
    }

    public void sameNameMethod(){
        System.out.println("父类方法执行！");
    }

}
