package Thread;

public class Demo01 {
    public static void main(String[] args)  {

        RunnableImpl implRunnable=new RunnableImpl();
        Thread newThread=new Thread(implRunnable);/**通过在Thread类中传递一个实现Runnable接口的类来开启多线程*/
        newThread.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
        new Thread(new RunnableImpl02()).start(); //Thread类执行多线程依赖于继承Thread的类(MyThread)，一旦重写run()方法则不能快速修改使用
                                            //实现runnable接口则可分离线程任务设置和开启，再写一个实现类即可添加不同线程的run方法
    }
}
