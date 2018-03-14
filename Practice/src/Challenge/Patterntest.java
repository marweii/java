package Challenge;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterntest {
    public static void main(String[] args){
        String str = "[1,2,3,4,5,6,7,8,9,0,11,12,13]";
        Pattern pattern =Pattern.compile("[^0-9][\\u0033]");
        Matcher matcher =pattern.matcher(str);
        while (matcher.find()){
           System.out.println(matcher.group().toString().substring(1,2));
        }
    }
}
