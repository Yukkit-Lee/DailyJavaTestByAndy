package PracticePack;

public class Demo {
    public static void main(String[] args) {
        int[] score={99,63,58};
        int[] score2={60,63,58};
        Graduate xiaoming=new Graduate(17,"xiaoming",score);
Undergraduate xiaohong=new Undergraduate(20,"xiaohong",score2);
        System.out.println(xiaoming.isPass());;
        System.out.println(xiaohong.isPass());;
    }
}
