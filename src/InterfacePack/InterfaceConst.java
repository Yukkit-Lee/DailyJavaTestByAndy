package InterfacePack;

//接口中也可以定义成员变量 需用public static final三个关键字修饰
// public static final 数据类型 常量名称;
//接口中的常量必须进行赋值
public interface InterfaceConst {

    //接口中常量名称，使用完全大写的字母，用下划线进行分隔
    public static final int NUM_CONST=8;


    public default void Method2(){
        System.out.println("default方法！");
    };

    public static void Method03(){
        System.out.println("static方法实现!");
    }
}
