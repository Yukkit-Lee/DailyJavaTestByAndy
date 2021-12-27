package PracticePack;

public class Undergraduate extends Student{

    public Undergraduate(int num, String name, int[] score) {
        super(num, name, score);
    }

    @Override
    public boolean isPass() {
        double sum=0;
        for (int i = 0; i < score.length; i++) {
            sum+=this.score[i];
        }
        return sum/3>80;
    }
}
