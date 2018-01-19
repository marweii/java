package Challenge;

import java.util.Scanner;

public class CheckNums {
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().replaceAll(" ","");
        String[] num11=str.split("&");
        int num1 = Integer.valueOf(num11[0]);
        String[] num22 = num11[1].split("=");
        int num2 = Integer.valueOf(num22[1]);
        System.out.print(Nums(num1,num2));
    }
    public static String Nums(int num1,int num2){
        if(num2>num1)
            return "true";
        else if (num1==num2){
            return "-1";
        }
        else
            return "false";
    }
}
