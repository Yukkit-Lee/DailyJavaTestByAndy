package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//Format(abstract) -> DateFormat(abstract) -> SimpleDateFormat
public class DatePractice {
    public static void main(String[] args) throws ParseException {
        Date currentDate=new Date();
        SimpleDateFormat formatDate=new SimpleDateFormat("yyyy-MM-dd");
        String birthDay=new Scanner(System.in).next();
        Date birthDayDate=formatDate.parse(birthDay);//利用parse方法将String birthDay解析为date类对象
        System.out.println(birthDayDate);
        long res=currentDate.getTime()-birthDayDate.getTime();
        System.out.println(res/1000/60/60/24);

    }
}
