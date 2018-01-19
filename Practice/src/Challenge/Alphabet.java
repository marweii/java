package Challenge;

import java.util.Scanner;

public class Alphabet {
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(AlphabetSoup(s.nextLine()));
    }
    public static String AlphabetSoup(String str){
        char[] chars = str.toCharArray();
        char temp;
        for(int i = 0;i< chars.length-1;i++){
            for(int j = i+1;j<chars.length;j++){
                if(chars[i]>chars[j]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        String ctr = String.valueOf(chars);
        return ctr;
    }
}
