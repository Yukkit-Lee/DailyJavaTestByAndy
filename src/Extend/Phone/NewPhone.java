package Extend.Phone;
//对于已投入使用的类(Phone)，尽量不要进行修改。
//推荐定义一个新的类(NewPhone)，来重复利用其中共性内容，并且添加新内容

public class NewPhone extends Phone{
    @Override
    public void show(){
        super.show();   //使用super关键字直接调用父类方法，节省代码
        System.out.println("caller name is xxx!");
        System.out.println("caller age is xxx!");
    }
}
