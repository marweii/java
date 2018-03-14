package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author jiangqn
 * @Date 2018-03-07 14:59
 * @Description
 **/
public class test {
    public static void main(String[] args){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date today=new Date();
        Date yesterday=new Date(today.getTime()-1000*60*60*24);
        String todayTime=format.format(today);
        String yesterdayTime=format.format(yesterday);
        System.out.println("现在时间："+todayTime);
        System.out.println("昨天时间："+yesterdayTime);
    }
}
