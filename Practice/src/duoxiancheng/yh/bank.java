package duoxiancheng.yh;

/**
 * @Author jiangqn
 * @Date 2018-01-31 13:49
 * @Description bank
 **/
public class bank {
    public static int money = 1000;
    public void Counter(int a ){
        money = money-a;
        System.out.println("A取走了"+a);
        System.out.println("还剩下"+money);
    }
    public void Atm(int b){
        money = money-b;
        System.out.println("B取走了"+b);
        System.out.println("还剩下"+money);
    }
}
