package Thread.SafeProblemInThread;

import javax.swing.plaf.TableHeaderUI;

public class SaleTicket implements Runnable {

    private int ticketCount = 100;

    @Override
    public void run() {
        while(true){
            if (ticketCount > 0) {
                //提高安全问题出现的概率
                try {
                    Thread.sleep(10);//线程执行到if后由于sleep，则当前线程失去cpu执行权
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " 正在卖第" + ticketCount + "张票");
                ticketCount--;
            }
        }
    }
}
