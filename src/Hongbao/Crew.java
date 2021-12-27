package Hongbao;

import java.util.ArrayList;
import java.util.Random;

public class Crew extends User {
    public Crew() {
    }

    public Crew(String name, double money) {
        super(name, money);
    }

    public void receivePacket(ArrayList<Double> n) {

        int index=new Random().nextInt(n.size());
        Double delta = n.remove(index);   //集合中的remove方法为删除相应索引的元素，返回值为其元素值

        super.setMoney(delta+super. getMoney());
    }
}
