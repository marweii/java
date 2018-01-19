package Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Scale {
    public static void main (String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(ScaleBalancing(s.nextLine()));
    }

    private static int ScaleBalancing(String s) {
        String str = s.replaceAll("\"","");
        String str1 = str.replaceAll(",","").replaceAll(" ","");
        int sum1=0;
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> b1 = new ArrayList<>();
        char[] chars = str1.toCharArray();
        for(int i =0;i<chars.length;i++){
            if(chars[i]=='1'){
                sum1++;
                a1.add(i);
            }
            if(chars[i]=='2'){
                b1.add(i);
            }
        }
        if(sum1!=1){
            return 0;
        }
        ArrayList<String> s1 = new ArrayList<>();
        String[] s2 = str.split(",");
        //orthogon length
        int length = s2[0].length();
        int width = s2.length;
        int a1y = a1.get(0)/(length);
        int a1x = a1.get(0)%(length);
        int sum =1000;
        int temp = 0;
        for(int i =0;i<b1.size();i++){
            int b1y = b1.get(i)/(length);
            int b1x = b1.get(i)%(length);

            int abs1 = Math.abs(a1y-b1y);
            int abs2 = Math.abs(a1x-b1x);
            if(abs1>(width/2)){
                abs1 = width-abs1;
            }
            if(abs2>(length/2)){
                abs2 = length-abs2;
            }
            if(sum > abs1*abs1+abs2*abs2)
            {
                sum =abs1*abs1+abs2*abs2;
                temp = i;
            }
        }
        int b1y = b1.get(temp)/(s2[0].length());
        int b1x = b1.get(temp)%(s2[0].length());
        int abs3 = Math.abs(a1y-b1y);
        int abs4 = Math.abs(a1x-b1x);
        if(abs3>(width/2)){
            abs3 = width-abs3;
        }
        if(abs4>(length/2)){
            abs4 = length-abs4;
        }
        int allsum = abs3+abs4;
        return allsum;

    }

}
