package Hongbao;

import java.util.ArrayList;
import java.util.Random;

public class Owner extends User {

    public Owner() {
    }

    public Owner(String name, double money) {
        super(name, money);
    }

    public ArrayList<Double> sendPacket(double totalMoney, int packetCount) {
        ArrayList<Double> redPacketData = new ArrayList<>();

        //判断余额是否充足
        double leftMoney = super.getMoney();
        if (totalMoney > leftMoney) {
            System.out.println("余额不足!");
            return redPacketData;
        }

        //扣除群主钱
        super.setMoney(leftMoney-totalMoney);


        //生成随机数拆分红包
        Random randomNum = new Random();
        for (int i = 0; i < packetCount; i++) {
            double ranMon = randomNum.nextDouble()*totalMoney;   //随机生成一个[0,totalMoney)的双精度浮点数
            if(i!=packetCount-1)
            {
                totalMoney -= ranMon;
                redPacketData.add(ranMon);
            }
            else //将未分完的钱放入最后一个红包中
                redPacketData.add(totalMoney);
        }

        return redPacketData;

    }
}
