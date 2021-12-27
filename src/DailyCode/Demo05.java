//package DailyCode;
//
//public class Demo05 {
//
//    public String firstPalindrome(String[] words) {
//        for (int i = 0; i < words.length; i++) {
//            for (int j = 0; j < words[i].length(); i++) {
//                int x = 0, y = words[i].length() - 1;
//                while (words[i].charAt(x) == words[i].charAt(y)) {
//                    x++;
//                    y--;
//                }
//                if(x-y==2)
//                    return words[i];
//            }
//        }
//        return "";
//    }
//
//    public static void main(String[] args) {
//        String[] a = {"abc", "car", "ada", "racecar", "cool"};
//        System.out.println(new Demo05().firstPalindrome(a));
//        StringBuilder b = new StringBuilder("oooo");
//        String c = new String("oooo");
//        System.out.println(b.equals(c));
//    }
//}
