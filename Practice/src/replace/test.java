package replace;

public class test {
    public static void  main(String[] args){
        String a = "name=jiangqn";
        String b = "{\""+a.replaceAll("=","\":\"")+"\"}";
        System.out.println(b);
    }
}
