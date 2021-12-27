package Hongbao;

import java.text.DecimalFormat;

public class User {
    private String name;
    private double money;

    public User(){
    }

    public User(String name,double money)
    {
        this.money=money;
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("#.##");//新建df对象精确小数位数
        return "我是" + name  + ", 现在的余额是:" + money ;
    }
}
