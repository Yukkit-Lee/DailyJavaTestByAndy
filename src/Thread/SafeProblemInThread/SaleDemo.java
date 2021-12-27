package Thread.SafeProblemInThread;

/**多线程访问共享数据 会出现 线程安全问题*/
//(多线程不访问共享数据 则不会出现线程安全问题)
public class SaleDemo {
    public static void main(String[] args) {

        SaleTicket t1=new SaleTicket();
        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();
    }
}


