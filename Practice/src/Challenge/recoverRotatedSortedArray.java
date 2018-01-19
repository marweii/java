package Challenge;

import java.util.ArrayList;
import java.util.List;

public class recoverRotatedSortedArray {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(4);list.add(5);list.add(1);list.add(2);list.add(3);
        for (Integer i:recoverRotatedSortedArray1(list)
             ) {
            System.out.print(i+",");
        }
    }
    public static List<Integer> recoverRotatedSortedArray1(List<Integer> nums) {
        // write your code here
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.size();i++){
            if(nums.get(i)>nums.get(i+1)){
                for(int j =i+1;j<nums.size();j++){
                    list.add(nums.get(j));
                }
                for(int j=0;j<=i;j++){
                    list.add(nums.get(j));
                }
                break;
            }
        }
        return list;
    }
}
