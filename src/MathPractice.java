//计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个
public class MathPractice {
    public static void main(String[] args) {
        int ansCount = 0;
        double testNum;
        for (testNum = Math.ceil(-10.8); testNum < Math.floor(5.9); testNum++) {
            if (Math.abs(testNum) > 6 || Math.abs(testNum) <= Math.floor(2.1)) {
                System.out.print(testNum+" ");
                ansCount++;
            }
        }
        System.out.println();
        System.out.println(ansCount);
    }
}
