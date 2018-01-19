package DBtest;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class bijiao {
    public static void main(String[] args) throws ParseException {
        String time1 = "07:10";
        String time2 = "08:00";
        SimpleDateFormat ft = new SimpleDateFormat("HH:mm");
        java.util.Date date = ft.parse(time1);
        java.util.Date date1 = ft.parse(time2);
        if(date.compareTo(date1)<0){
            System.out.println("1在2之前");
        }

    }
}
