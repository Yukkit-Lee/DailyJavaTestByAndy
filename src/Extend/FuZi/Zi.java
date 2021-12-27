package Extend.FuZi;

import Extend.FuZi.Fu;

public class Zi extends Fu {
    @Override
    public Object testMethod() {
        return null;
    } //success

//    @Override
//    public Object testFalseMethod() {  //Object 标红报错
//        return null;    //子类方法的返回值必须【小于等于】父类方法的返回值范围；
//                          //Object类为最高类
//    }

//    @Override
//    private void rightMethod() {   //private 标红报错
//        return ;    //子类方法的权限必须【大于等于】父类方法的权限修饰符；
//                    //public > protected > (default) > private
//    }
}
