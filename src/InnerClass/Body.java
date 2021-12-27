package InnerClass;

public class Body {

    private String name;

    public Body() {

    }

    public Body(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void Method(){
        System.out.println("外部类方法执行!");
    }

    //新定义一个内部类
    public class Heart {
        public void jump() {
            Method();
            System.out.println("My name is " + name); //内部类中可访问外部类成员变量及方法
            System.out.println("pppp!~");
        }

    }
}
