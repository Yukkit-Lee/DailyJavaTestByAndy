package InnerClass;

/*
(局部内部类定义不需要修饰符)
 * 局部内部类 ，如果希望访问所在方法的局部变量，那么这个局部变量必须是【final】
 *
 * java 8+开始，只要局部变量事实不变，那么final关键字可以省略
 *
 * 为什么必须是final?
 * 1.new出来的对象是在堆内存中
 * 2.局部变量num跟着method方法走，在栈内存中
 * 3.方法运行结束后，立刻出栈，局部变量立刻消失
 * 4.但new出来的对象会在堆内存中，直到对象消失被回收
 *
 * */


public class LocalInnerClass {
    public void method() {
        int num = 10;//所在方法的局部变量 == final int num=10;
        //num=20;重新复制 sout语句num则会报错

        class InnerClass {
            public void Method() {
                System.out.println(num);
            }
        }

    }
}
