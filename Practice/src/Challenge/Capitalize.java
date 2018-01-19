package Challenge;

import java.util.Scanner;

public class Capitalize {
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }
    public static String LetterCapitalize(String str){
        String[] strings = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<strings.length;i++){
            char[] chars = strings[i].toCharArray();
            if(chars[0]>='a'&&chars[0]<='z') {
                chars[0] = (char) ((int) chars[0] - 32);
            }
            if(i!=strings.length-1) {
                sb.append(String.valueOf(chars) + " ");
            }else{
                sb.append(String.valueOf(chars));
            }
        }
        return sb.toString();
    }
}
