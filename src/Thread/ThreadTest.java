package Thread;

public class ThreadTest {


    public static void main(String[] args) {

        MyThread myThread=new MyThread();
        myThread.setName("idea 2020.3.4线程");
        myThread.start();

        new MyThread().start();//调用多线程需新建另外一个对象
        System.out.println(Thread.currentThread().getName());
    }
}
