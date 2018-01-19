package Challenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class digitCounts {
    public static void main(String[] args){
        System.out.println(digitCount(1,10));
    }
    public static int digitCount(int k, int n) {
        // write your code here
        String k1 = String.valueOf(k);
        char k2 = k1.charAt(0);
        int count=0;
        for(int i=0;i<=n;i++){
            String x = String.valueOf(i);
            char[] chars = x.toCharArray();
            for(int j=0;j<chars.length;j++){
                if(chars[j]==k2){
                    count++;
                }
            }
        }
        return count;
    }
}
