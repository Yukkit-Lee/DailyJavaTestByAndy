package DailyCode;

public class Demo07 {
    public String addSpaces(String s, int[] spaces) {
        String res=new String();
        int p=0;
        res=s.substring(0,spaces[0]);
        for(int i=0;i<spaces.length;i++)
        {
            if(p<spaces.length-1)
            res=res+" "+s.substring(spaces[i],spaces[i+1]);// 1  5   5  7
            else
                res=res+" "+s.substring(spaces[i],s.length());
            p++;
        }

        return res;
    }

    public static void main(String[] args) {
//      s = "icodeinpython", spaces = [1,5,7]
//      "i code in python"
//        String str="1bacdef";
        String s="icodeinpython";
        int[] spaces={1,5,7};
        String[] a =s.split("e",3);
        System.out.println(a);
        System.out.println(new Demo07().addSpaces(s,spaces));

//        System.out.println(str.substring(0,2));//1b
//        System.out.println(str.substring(1,5));//bacd
//        System.out.println(str.indexOf('a'));

        String ab = "abcdefg";
        String split = "(.{2})";
        String sb = ab.replaceAll(split, "$1 ");
        System.out.println(sb);
    }
}
