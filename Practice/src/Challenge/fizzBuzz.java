package Challenge;

import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {
    public List<String> fizzBuzz1(int n) {
        // write your code here
        List<String> list = new ArrayList<>();
        if(n>=1){
            for(int i=1;i<=n;i++){
                if(i%3==0&&i%5!=0){
                    list.add("fizz");
                }
                else if(i%3!=0&&i%5==0){
                    list.add("buzz");
                }
                else if(i%3==0&&i%5==0){
                    list.add("fizz buzz");
                }else {
                   list.add(String.valueOf(i));
                }
            }
        }
        return list;
    }
}
