package Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(longword(scanner.nextLine()));
    }

    public static String longword(String str){
        str = str.trim();
        char[] charstr = str.toCharArray();
        ArrayList<Integer> star = new ArrayList<>();
        ArrayList<Integer> end = new ArrayList<>();
        ArrayList<Integer> sum = new ArrayList<>();
        int charsize = charstr.length;
        for(int i=0;i<charsize;i++){
            if(charstr[i]>='a'&& charstr[i]<='z' ||charstr[i]>='A'&& charstr[i]<='Z'){
                star.add(i);
               while(charstr[i]>='a'&& charstr[i]<='z' ||charstr[i]>='A'&& charstr[i]<='Z'){
                   i++;
                   if(i>=charsize){
                       break;
                   }
               }
               end.add(i);
            }
        }
        for(int x= 0;x<star.size();x++){
            sum.add(end.get(x)-star.get(x));
        }
        int max = 0;
        for (int i= 0;i<sum.size();i++){
            if(sum.get(i)>sum.get(max)){
                max=i;
            }
        }
        return str.substring(star.get(max),end.get(max));
    }
}
