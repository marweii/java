package duoxiancheng.guitu;

/**
 * @Author jiangqn
 * @Date 2018-01-31 14:36
 * @Description ..
 **/
public class Rabbit extends Animal {

    public Rabbit(){
        setName("兔子");
    }
    @Override
    public void running() {
        double dis = 0.5;
        length = length-dis;
        if(length<=0){
            length =0;
            System.out.println("兔子胜利");
            if(calltoback!=null){
                calltoback.win();
            }
        }
        System.out.println("兔子跑了" + dis + "米，距离终点还有" + (int)length + "米");
        if (length % 2 == 0){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
