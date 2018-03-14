package xiaoshudian;

import java.math.BigDecimal;

/**
 * @Author jiangqn
 * @Date 2018-03-07 15:31
 * @Description
 **/
public class test {
    public static void main(String[] args){
        double   f   =   111231.5515;
        BigDecimal b   =   new   BigDecimal(f);
        double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);
    }
}
