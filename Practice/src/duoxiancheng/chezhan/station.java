package duoxiancheng.chezhan;

/**
 * @Author jiangqn
 * @Date 2018-01-31 13:35
 * @Description station
 **/
public class station extends Thread{
    public station(String name){
        super(name);
    }
    public static int ticket = 20;
    public static String key = "aa";
    public void run(){
        while(ticket>0) {
            synchronized (key) {
                System.out.println(getName() + "购票成功.");
                ticket--;
                System.out.println("目前票数:" + ticket);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
