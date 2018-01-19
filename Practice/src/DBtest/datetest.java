package DBtest;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class datetest {
    public static void main(String[] args){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//小写的mm表示的是分钟
        String dstr="2018-01-08 12:12:30";
        try {
            java.util.Date date=sdf.parse(dstr);
            System.out.println(sdf.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
