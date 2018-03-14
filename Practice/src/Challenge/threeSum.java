package Challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author jiangqn
 * @Date 2018-01-31 11:06
 * @Description threeSum
 **/
public class threeSum {
    public static void main(String[] args){
        int[] S = {-1 ,0 ,1 ,2 ,-1, -4};
        List<List<Integer>> a = threeSum1(S);
        for(int i =0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
    public static List<List<Integer>> threeSum1(int[] numbers) {
        List<List<Integer>> lists = new ArrayList<>();
        for(int i=0;i<numbers.length-2;i++){
            for(int j=i+1;j<numbers.length-1;j++){
                for(int k=j+1;k<numbers.length;k++){
                    List<Integer> list = new ArrayList<>();
                    if(numbers[i]+numbers[j]+numbers[k]==0){
                        list.add(numbers[i]);
                        list.add(numbers[j]);
                        list.add(numbers[k]);
                        Collections.sort(list);
                        lists.add(list);
                    }
                }
            }
        }
        return lists;
    }
}
