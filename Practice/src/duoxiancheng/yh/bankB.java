package duoxiancheng.yh;

/**
 * @Author jiangqn
 * @Date 2018-01-31 13:53
 * @Description a
 **/
public class bankB extends Thread{
    private bank bank;
    public bankB(bank bank){
        this.bank = bank;
    }
    public void run(){
        while(bank.money>=200) {
            bank.Atm(200);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
