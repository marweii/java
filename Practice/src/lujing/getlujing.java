package lujing;
import java.net.URL;


public class getlujing {
    public void get(){
        URL url = this.getClass().getResource("");
        System.out.println(url);
    }
    public static void main(String[] args){
        getlujing g1 = new getlujing();
        g1.get();

    }
}
