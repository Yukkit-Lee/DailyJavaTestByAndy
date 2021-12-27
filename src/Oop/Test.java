package Oop;

public class Test {
    public static void main(String[] args) {

       Card newone=new Card();
        Dizhu dizhu=new Dizhu(newone);
        Nongming nongming=new Nongming(newone);

        new Thread(dizhu).start();
        new Thread(nongming).start();
    }
}
