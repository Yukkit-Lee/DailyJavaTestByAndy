
package DailyCode;
import java.util.*;
    public class Son extends Father{
        int num=5;
        public void say() {
            System.out.println("son");
        }
        public void aaa(){
            System.out.println(1);
        }
        public static void action(){
            System.out.println("打打！");
        }
        public static void main(String[] args) {
            Father f=new Son();
            f.say();
            f.action();

            System.out.println(f.num);
        }
    }

