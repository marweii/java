package Challenge;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class dicesSum {
    public void sortLetters(char[] chars) {
        // write your code here
        StringBuffer list1 = new StringBuffer();
        StringBuffer list2 = new StringBuffer();
        for(int i=0;i<chars.length;i++){
            if(chars[i]>='a'&&chars[i]<='z'){
                list1.append(String.valueOf(chars[i]));
            }
            if(chars[i]>='A'&&chars[i]<='Z'){
                list2.append(String.valueOf(chars[i]));
            }
        }
        chars=(list1.toString()+list2.toString()).toCharArray();
    }
}
