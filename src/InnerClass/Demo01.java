package InnerClass;

public class Demo01 {
    public static void main(String[] args) {
        Body myBody=new Body("andy");

        //外部类名称.内部类名称 对象名 = new 外部类名称(). 内部类名称();
        Body.Heart myBodyHeart=new Body("Andy").new Heart();

        myBodyHeart.jump();
    }


}
