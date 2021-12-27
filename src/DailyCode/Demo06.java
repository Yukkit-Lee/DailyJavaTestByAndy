package DailyCode;

public class Demo06 {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            StringBuilder word=new StringBuilder(words[i]);
            if(word.toString().equals(word.reverse().toString()))
                return words[i];
        }


        return "";
    }

    public static void main(String[] args) {

        String[] a = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(new Demo06().firstPalindrome(a));
//        StringBuilder b=new StringBuilder(a[0]);
//        System.out.println(b);
//        System.out.println(b.reverse());
//        System.out.println(b.equals(b.reverse()));
    }
}
