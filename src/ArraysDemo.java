import java.util.Arrays;
//Arrays工具类
public class ArraysDemo {
    public static void main(String[] args) {
        String[] randomStr={"a","va","op"};
        Arrays.sort(randomStr);
        System.out.println(Arrays.toString(randomStr));

        String randomeStr02="asjnvoermfkzmw";
        char[] chars = randomeStr02.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }

}
