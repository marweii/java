package Challenge;

import java.util.Scanner;

public class SimpleSymbols {
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(Symbols(s.nextLine()));

    }
    public static String Symbols(String str){
        char[] chars =str.toCharArray();
        for(int i =0;i <chars.length;i++){
            if(chars[i]>='a'&&chars[i]<='z'||chars[i]>='A'&&chars[i]<='Z'){
                if(i>=1&&i<=chars.length-2) {
                    if (chars[i - 1] != '+' || chars[i + 1] != '+') {
                        return "false";
                    }
                }
                else if(i==0||i==chars.length-1){
                    return "false";
                }
            }
        }
        return "true";
    }
}
