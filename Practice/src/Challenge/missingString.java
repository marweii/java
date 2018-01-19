package Challenge;

import java.util.ArrayList;
import java.util.List;

public class missingString {
    public static void main(String[] args){
        String str1 = "This is an example";
        String str2 = "is example";
        List<String> list =missingString1(str1,str2);
        for (String strings:list
             ) {
            System.out.println(strings);
        }
    }
    public static List<String> missingString1(String str1, String str2) {
        // Write your code here
        String[] str3 = str1.split(" ");
        String[] str4 = str2.split(" ");
        List<String> list = new ArrayList<>();
        for(int i =0;i<str3.length;i++){
            int temp=0;
            for(int j =0;j<str4.length;j++){
                if(str3[i].compareTo(str4[j])==0){
                    temp=1;
                }
            }
            if(temp==0){
                list.add(str3[i]);
            }
        }
        return list;
    }
}
