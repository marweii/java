package Challenge;

import com.mysql.fabric.xmlrpc.base.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Kaprekars {
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(KaprekarsConstant(s.nextLine()));
    }
    public static int KaprekarsConstant(String str) {
        int sub = Integer.valueOf(str);
        int sum =0;
        while(sub!=6174){
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(sub/1000);
            integers.add((sub%1000)/100);
            integers.add((sub%100)/10);
            integers.add(sub%10);
            Collections.sort(integers);
            sub = integers.get(3)*1000+integers.get(2)*100+integers.get(1)*10+integers.get(0)-(integers.get(0)*1000+integers.get(1)*100+integers.get(2)*10+integers.get(3));
            sum++;
        }
        return sum;
    }
}
