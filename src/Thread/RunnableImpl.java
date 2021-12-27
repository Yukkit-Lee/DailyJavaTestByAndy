package Thread;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
/**实现Runnable接口的好处：
 * 1.避免了单继承的局限性
 *  一个类继承了Thread类就只能继承这一个类，如实现Runnable接口则可以继续继承类，实现其他的接口
 * 2.增强了程序的扩展性，降低了程序的耦合性
 *   实现Runnable接口的方式，把设置线程任务和开启新线程进行了分离
 *   实现类中重写run方法：用来设置线程任务
 *   创建Thread对象，调用start方法开启新的线程执行run方法
 * */