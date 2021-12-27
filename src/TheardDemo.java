public class TheardDemo {
    public static void main(String[] args) {
        Object lockObject = new Object();
        /**sleep不释放锁 wait释放锁*/
        new Thread() {

            @Override
            public void run() {
                //一直等着买包子 （一直进行循环打牌）
                while (true) {
                    synchronized (lockObject) {
                        System.out.println("顾客：告诉老板种类和数量!");
                        try {
                            lockObject.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒以后执行的代码
                        System.out.println("顾客：开吃！");
                        System.out.println("==============");
                    }
                }
            }
        }.start();


        new Thread() {

            @Override
            public void run() {
                //一直循环做包子 （一直循环打牌）
                while (true) {
                    try {
                        Thread.sleep(6000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lockObject) {
                        System.out.println("1号老板：6秒后做好包子，唤醒顾客");
                        lockObject.notify();
                    }
                }

            }

        }.start();

    }
}
