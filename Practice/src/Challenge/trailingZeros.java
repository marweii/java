package Challenge;

public class trailingZeros {
    public static void main(String[] args){
       System.out.println(Zeros(20));
    }
    public static long Zeros(long n){
        int temp;
        for(int i =1;;i++){
            if(n<Math.pow(5,i)){
                temp =i;
                break;
            }
        }
        long sum =0;
        for(int i =1;i<=temp-1;i++){
            sum =sum+ (long) (n/(Math.pow(5,i)));
        }
        return sum;
    }
}
