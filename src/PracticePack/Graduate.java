package PracticePack;

public class Graduate extends Student{

    public Graduate(int num, String name, int[] score) {
        super(num, name, score);
    }

    @Override
    public boolean isPass() {
        double sum=0;
        for (int i = 0; i < score.length; i++) {
            sum+=this.score[i];
        }
        return sum/3>60;
    }
}
