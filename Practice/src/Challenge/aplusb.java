package Challenge;

public class aplusb {
    public static int add(int a,int b){
        while(b!=0){
            a = a^b;
            b = (a&b)<<1;
        }
        return a;
    }
    public static void main(String[] args){
        System.out.println(add(1,2));
    }
}
