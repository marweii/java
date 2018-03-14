package duoxiancheng.yh;

/**
 * @Author jiangqn
 * @Date 2018-01-31 14:01
 * @Description 11
 **/
public class runbank {
    public static void main(String[] args){
        bank bank = new bank();
        Thread a= new bankA(bank);
        Thread b= new bankB(bank);
        a.start();
        b.start();
    }
}
