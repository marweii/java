package Challenge;

import java.util.Scanner;

public class testReplace {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String restr = str.replaceAll("[a-z]+","");
        System.out.println(restr);
    }
}
