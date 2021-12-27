package Oop;

public class Nongming implements Runnable {
    private Card card;

    public Nongming(Card card) {
        this.card = card;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (card) {
                if (card.isPassed == false) {
                    try {
                        card.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒后执行
                System.out.println("农民出牌！");//此处返回一个param(int)
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                card.cardNum--;//card.cardNum-=param
                card.isPassed = false;
                System.out.println("出牌完毕，唤醒地主线程出牌");
                card.notify();

            }
        }
    }
}
