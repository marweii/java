package sisuo;

public class DeadLockDemo {
    public static Object addlock = new Object();
    public static Object sublock = new Object();
    public static void main (String[] args){
        MyAdditionThread add = new MyAdditionThread();
        MySubtractionThread sub = new MySubtractionThread();
        add.start();
        sub.start();
    }
}
class MyAdditionThread extends Thread{
    public void run() {
        synchronized (DeadLockDemo.addlock){
        int a = 10,b=3;
        int c = a+b;
        System.out.println("Addition Thread:" +c);
        System.out.println("Hold fist lock.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Addition Thread: Waiting for Addlock.");
            synchronized (DeadLockDemo.sublock){
                System.out.println("Threads:Hold Add and Sub locks..");
            }
        }
    }
}
class MySubtractionThread extends Thread{
    public void run() {
        synchronized (DeadLockDemo.addlock){
            int a = 10,b=3;
            int c = a-b;
            System.out.println("Subtracton Thread:" +c);
            System.out.println("Hold second lock.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Subtraction Thread: Waiting for Sublock.");
            synchronized (DeadLockDemo.sublock){
                System.out.println("Threads:Hold Add and Sub locks..");
            }
        }
    }
}
