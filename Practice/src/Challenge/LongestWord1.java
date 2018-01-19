package Challenge;

import java.util.Scanner;

public class LongestWord1 {
    public static String LongestWord(String sen) {
        int smallest = 0;
        String[] parts = sen.replaceAll("[^a-zA-Z ]", "").split(" ");
        String ben = "a";
        for(int i=0; i<parts.length; i++){
            if(parts[i].length() > smallest){
                smallest=parts[i].length();
                ben = parts[i];
            }
        }
        return ben;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }
}
