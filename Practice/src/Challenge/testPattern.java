package Challenge;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testPattern {
    public static String QuestionsMarks(String str) {
        str = str.replaceAll("[a-z]+","");
        Pattern pattern = Pattern.compile("([0-9])([?])([?])([?])([0-9])");
        Pattern pattern01 = Pattern.compile("([0-9])([?])([?])([0-9])");
        Matcher matcher01 = pattern01.matcher(str);
        Pattern pattern02 = Pattern.compile("([0-9])([?])([0-9])");
        Matcher matcher02 = pattern02.matcher(str);
        Matcher matcher = pattern.matcher(str);
        if(matcher01.find() || matcher02.find()){
            return "false";
        }else if(matcher.find()){
            return "true";
        }

        return "false";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }
}
