package PracticePack;

public abstract class Student {
    public int num;
    String name;
    int[] score;

    public Student(){

    }


    public Student(int num, String name, int[] score) {
        this.num = num;
        this.name = name;
        this.score = score;
    }

    public abstract boolean isPass();
}
