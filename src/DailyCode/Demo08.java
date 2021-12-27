package DailyCode;

public class Demo08 {
    private static int a = 9;


    public void method(int i) {
        Demo08.a = i;
        this.a=i+1;
    }

    public int getMethod(){
        return this.a;
    }
    public int getMethod2(){
        return Demo08.a;
    }

    public static void main(String[] args) {

            Demo08 a=new Demo08();
            a.method(4);
        System.out.println(Demo08.a);
        System.out.println(a.getMethod());
        System.out.println(a.getMethod2());
    }
}
