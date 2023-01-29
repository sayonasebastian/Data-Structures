
// 977. Squares of a Sorted Array
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] r = new int[nums.length];
        int k = nums.length-1;
        for(int i=0, j= k;i<=j && k>=0;){
            
           if((nums[i] * nums[i] ) > (nums[j]*nums[j] )){
               r[k] = nums[i] * nums[i];
               i++;
           } else{
               r[k] = nums[j]*nums[j];
               j--;
           }
            k--;
        }
        return r;
    }
}