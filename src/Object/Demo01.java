package Object;


import java.sql.SQLOutput;
import java.util.Objects;

/*
*     public boolean equals(Object obj) {
        return this == obj;
    }
    * */
public class Demo01 {
    public static void main(String[] args) {
        ObjectTest myObj = new ObjectTest("xiaoming", 11);
        ObjectTest myObjw2 = new ObjectTest("xiaoming", 11);
        System.out.println(myObj.equals(myObjw2));

        String name = "123";
        String name2 = "123";
        System.out.println(name.equals(name2));//String类的equals实际上比较的是地址值，但因为字符串常量池所以相等

        System.out.println("===============");
        String dataString = "123";
        String nullString = null;
        //System.out.println(nullString.equals(dataString));//空指针调用equals方法抛出 ->NullPointerException
        System.out.println(Objects.equals(dataString, nullString));//利用【Objects】类的equals方法防止空指针异常
    }


}
