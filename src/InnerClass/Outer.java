package InnerClass;

public class Outer {
    int num=10;

    public class Inner{
        int num=20;

        public void method(){
            int num=30;
            System.out.println(num); //num为方法内局部变量 -> 30
            System.out.println(this.num); //内部类的num -> 20
            System.out.println(Outer.this.num); //外部类的num  ->10
        }

    }


}
