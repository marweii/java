package Challenge;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){
        int[]  nums= {5,5,4,3,2,1};
       int a =  findDuplicate(nums);
       System.out.println(a);
    }
    public static int findDuplicate(int[] nums) {
        // write your code here
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for(int i = 0;i<nums.length-1;i++){
            int temp =0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    temp++;
                }
            }
            if(temp>0){
                arrayList1.add(nums[i]);
            }
        }
            if(arrayList1.size()==1) {
                return arrayList1.get(0);
            }
            int temp1 =0;
            for(int j = 1;j<arrayList1.size();j++){
                if(arrayList1.get(0)!=arrayList1.get(j)){
                    temp1 =1;
                }
            }
            if(temp1==0){
                return arrayList1.get(0);
            }else {
                return -1;
            }
        }
}
