package Challenge;

import java.util.Scanner;

public class FirstReverse {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(Reverse(s.nextLine()));
    }
    public static String Reverse(String str){
        StringBuffer stringBuffer = new StringBuffer();
        String[] strings = str.split("");
        for(int i = strings.length-1;i>=0;i--){
            stringBuffer.append(strings[i]);
        }
        return stringBuffer.toString();
    }

}
