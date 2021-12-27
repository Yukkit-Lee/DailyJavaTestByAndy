package DailyCode;

public class Demo03 {
    public static int method() {
        int a=1;
        try{
            System.out.println(a);
            return ++a;
        }
        catch(Exception e)
        {
            System.out.println();
        }
        finally {
            System.out.println(++a);

        }
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
