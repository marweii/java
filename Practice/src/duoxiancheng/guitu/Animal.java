package duoxiancheng.guitu;

/**
 * @Author jiangqn
 * @Date 2018-01-31 14:32
 * @Description ...
 **/
public abstract class Animal extends Thread{
    public double length = 20;
    public abstract void running();

    public void run(){
        super.run();
        while(length>0){
            running();
        }
    }

    public  interface Calltoback{
         void win();
    }
    public Calltoback calltoback;

}
