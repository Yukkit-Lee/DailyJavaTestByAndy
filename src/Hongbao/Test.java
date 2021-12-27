package Hongbao;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Owner groupOwner=new Owner("群主",253.68);
        Crew groupMember01=new Crew("小明",0.0);
        Crew groupMember02=new Crew("阿强",0);
        Crew groupMember03=new Crew("小红",100.00);

        System.out.println(groupOwner);
        System.out.println(groupMember01);
        System.out.println(groupMember02);
        System.out.println(groupMember03);

        System.out.println("=========");

        ArrayList<Double> redPackList= groupOwner.sendPacket(5,3);
        groupMember01.receivePacket(redPackList);
        groupMember02.receivePacket(redPackList);
        groupMember03.receivePacket(redPackList);

        System.out.println(groupOwner);
        System.out.println(groupMember01);
        System.out.println(groupMember02);
        System.out.println(groupMember03);



    }
}
