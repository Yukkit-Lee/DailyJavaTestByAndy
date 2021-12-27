package Polymorphism;

import java.sql.SQLOutput;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("eattting..");
    }

    public void shout(){
        System.out.println("wang!");
    }
}
