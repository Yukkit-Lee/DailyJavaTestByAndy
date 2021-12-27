public class WaitMethod {
    /**使用wait(long millis)方法，若在毫秒值后未被notify唤醒，则会自动醒来进入runnable/blocked状态*/
    //若出牌者n毫秒后未被notify则也会执行下面动作
    public static void main(String[] args) {

        new Thread(){
            @Override
            public void run(){
                Object obj=new Object();
                synchronized (obj){
                    try {
                        obj.wait(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("进入Runnable状态!");
                }
            }
        }.start();
    }
}
