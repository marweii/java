package Challenge;

public class findPosition {
    public int findPosition1(int[] nums, int target) {
        // write your code here
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int middle = (start+end)>>1;
            if(target==nums[middle]){
                return middle;
            }
            else if(target>nums[middle]){
                start = middle +1;
            }
            else if(target<nums[middle]){
                end = middle -1;
            }
        }
        return -1;
    }
}
