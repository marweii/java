package Challenge;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterntest {
    public static void main(String[] args){
        String str = "123456789011121314";
        int temp =0;
        Pattern pattern =Pattern.compile("([1])");
        Matcher matcher =pattern.matcher(str);
        while (matcher.find()){
            temp++;
        }
        System.out.println(temp);
    }
}
