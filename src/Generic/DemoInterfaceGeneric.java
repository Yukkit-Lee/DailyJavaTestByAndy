package Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DemoInterfaceGeneric {
    public static void main(String[] args) {
        ImplClass obj1=new ImplClass();
        obj1.method("第一种方式在实现类中已指定泛型");
        //  例：Scanner类实现Iterator接口
        //public final class Scanner implements Iterator<String>

        Impl02Class<Integer> obj2=new Impl02Class<>();
        obj2.method(208);//第二种方式在创建对象时指定泛型
        // 例： ArrayList类实现List接口
        //public class ArrayList<E> implements List<E>

    }
}
