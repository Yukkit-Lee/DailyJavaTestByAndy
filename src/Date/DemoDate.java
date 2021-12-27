package Date;

import java.util.Date;

public class DemoDate {
    public static void main(String[] args) {
        method();
        method02();
        method03();
    }

    public static void method() {
        Date dateObj = new Date();
        System.out.println(dateObj);//无参构造返回的是现在时间值
    }
    public static void method02() {
        Date dateObj2 = new Date(551454165552L);//需要在末尾加 L
        //有参数的构造方法 -> 转换参数毫秒数为时间
        System.out.println(dateObj2);
    }

    public static void method03() {
        Date methodObj=new Date();
        System.out.println(methodObj.getTime());//Long getTime()方法返回当前时间至1970-1-1-00:00:00的毫秒值
        System.out.println(System.currentTimeMillis());//System类中的currentTimeMillis同样作用
    }

}
