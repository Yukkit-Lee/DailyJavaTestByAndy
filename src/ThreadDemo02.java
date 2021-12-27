public class ThreadDemo02 {
    public static void main(String[] args) {
        Object o = new Object();
        Thread a = new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        System.out.println("a线程执行!");
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //被唤醒
                        System.out.println("a线程被唤醒后执行!");
                    }
                }
            }
        };

        Thread b = new Thread() {
            @Override
            public void run() {

                while (true) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o) {
                        System.out.println("b线程执行!");
                        o.notify();
                        //被唤醒

                    }
                }
            }
        };
        a.start();
        b.start();
    }
}