package Challenge;

import java.util.Scanner;

public class chengjie {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(chengjie(scan.nextInt()));
    }
    public static int chengjie(int i){
        int sum =1;
        for(int x =1;x<=i;x++){
            sum = sum *x;
        }
        return sum;
    }
}
