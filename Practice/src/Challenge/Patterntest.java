package Challenge;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterntest {
    public static void main(String[] args){
        String str = "sadfasdf分解阿斯利康机发，。速度快撒娇的";
        Pattern pattern =Pattern.compile("([\\u4e00-\\u9fa5]|[\\w]|[\\u3002-\\uff0c])");
        Matcher matcher =pattern.matcher(str);
        while (matcher.find()){
           System.out.println(matcher.group());
        }
    }
}
