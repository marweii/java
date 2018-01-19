package Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Marks {
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }
    public static String QuestionsMarks(String str){
        char[] chars = str.toCharArray();
        ArrayList<Integer> integers = new ArrayList<>();
        for(int i = 0;i<chars.length-1;i++){
            for(int j=i+1;j<chars.length;j++){
                int sum =0;
                if((int)chars[i]+(int)chars[j]==106&&chars[i]>='1'&&chars[i]<='9'&&chars[j]>='1'&&chars[j]<='9'){
                    for(int x = i+1;x<j;x++){
                        if(chars[x]=='?'){
                           sum=sum+1;
                        }
                    }
                   integers.add(sum);
                }
            }
        }
        for(int i = 0;i<integers.size();i++){
            if(integers.get(i)<3){
                return "false";
            }
        }
        if(integers.size()>0){
            return "true";
        }else {
            return "false";
        }

    }
}
