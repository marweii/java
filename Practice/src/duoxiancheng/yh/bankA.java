package duoxiancheng.yh;

/**
 * @Author jiangqn
 * @Date 2018-01-31 13:53
 * @Description a
 **/
public class bankA extends Thread{
    private bank bank;
    public bankA(bank bank){
    this.bank = bank;
    }
    public void run(){
        while(bank.money>=100) {
            bank.Counter(100);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
