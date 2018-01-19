package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {
    public static SimpleDateFormat sdfLong = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static  void main (String[] args){
        String date = "2018-01-12 10:22:30";
        try {
            System.out.println(sdfLong.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
