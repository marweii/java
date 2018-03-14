package duoxiancheng.chezhan;

/**
 * @Author jiangqn
 * @Date 2018-01-31 13:40
 * @Description run
 **/
public class run {
    public static void main(String[] args){
        Thread sta1 = new station("1");
        Thread sta2 = new station("2");
        Thread sta3 = new station("3");
        sta1.start();
        sta2.start();
        sta3.start();
    }
}
