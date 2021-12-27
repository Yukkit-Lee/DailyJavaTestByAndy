/*
 * public static int abs(int num)
 * public static double ceil(double num) 向上取整
 * public static double floor(double num)  向下取整
 * public static long round(double num) 四舍五入
*
 * Math.PI  //圆周率π (double)
* */

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-9.8));
        System.out.println("--------");
        System.out.println(Math.ceil(99.1)); //100.0
        System.out.println(Math.ceil(81.9)); //82.0
        System.out.println("--------");
        System.out.println(Math.floor(27.1));//抹零 —> 27.0
        System.out.println(Math.floor(85.9));//抹零 —> 85.0
        System.out.println("--------");
        System.out.println(Math.round(5.5)); //6   round方法返回值为long 不加小数点
    }

}
