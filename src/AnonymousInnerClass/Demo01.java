package AnonymousInnerClass;

/*
 * 如果接口的实现类（或父类的子类）只需要使用唯一的一次，
 * 那么这种情况下就可以省略吊该类的定义，改而使用【匿名内部类】
 *
 * 格式：
 * 接口名称 对象名= new 接口名称(){
 * //覆盖重写接口所有抽象方法
 * };
 *
 * 备注：1.匿名内部类，在创建对象的时候，只能使用唯一一次
 *      (如果希望多次创建对象，而且类的内容一样，则必须定义单独实现类)
 * */
public class Demo01 {
    public static void main(String[] args) {

        //多态
        MyInterface obj = new ImplementsClass();
        obj.Method();

        System.out.println("=========");

        //匿名内部类
        MyInterface anonymous = new MyInterface() {
            @Override
            public void Method() {
                System.out.println("匿名内部类中覆盖重写方法");
            }

            @Override
            public void Method02() {
                System.out.println("匿名内部类中覆盖重写02方法");
            }
        };

        anonymous.Method();

        System.out.println("=========");

        MyInterface anonymous02 = new MyInterface() {
            @Override
            public void Method() {
                System.out.println("匿名内部类中覆盖重写方法");
            }

            @Override
            public void Method02() {
                System.out.println("匿名内部类中覆盖重写02方法");
            }
        };


        //使用 匿名内部类 省略对象名称 (匿名对象)
        new MyInterface() {
            @Override
            public void Method() {
                System.out.println("匿名内部类中覆盖重写方法");
            }

            @Override
            public void Method02() {
                System.out.println("匿名内部类中覆盖重写02方法");
            }

        }.Method();
    }
}
