package Challenge;

import java.util.Scanner;

public class LetterChanges {
    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(Changes(s.nextLine()));
    }

    public static String Changes(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z' || chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) ((int) chars[i] + 1);
            }
        }
        for(int i = 0;i<chars.length;i++){
            if(chars[i]=='a'||chars[i]=='e'||chars[i]=='i'||chars[i]=='o'||chars[i]=='u'){
                chars[i] = (char) ((int) chars[i] -32);
            }
        }
        return String.valueOf(chars);
    }
}
