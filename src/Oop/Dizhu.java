package Oop;

public class Dizhu implements Runnable {


    private Card card;

    public Dizhu(Card card) {
        this.card = card;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (card) {
                if (card.isPassed == true) {
                    try {
                        card.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒后执行
                System.out.println("地主出牌！");//此处返回一个param(int)
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                card.cardNum--;//card.cardNum-=param
                card.isPassed = true;//出完牌后将isPassed设置为true 表示已经出过牌
                System.out.println("出牌完毕，唤醒农民线程出牌");
                card.notify();

            }
        }
    }
}
