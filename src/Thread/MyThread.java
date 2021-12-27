package Thread;

public class MyThread extends Thread{
    @Override
    public void run(){//重写Thread类中的run方法，设置线程任务
        System.out.println(Thread.currentThread().getName());//获取当前线程名称
    }
}
