// Binary search
class Java {
    public int binarySaerch(int[] nums, int t, int s, int l){
        if(s>l){
            return -1;
        }
        int m = (s+l)/2;
        if(nums[m] == t){
            return m;
        }
        if(t<nums[m]){
            return binarySaerch(nums, t, s, m-1);
        }
        return binarySaerch(nums, t, m+1, l);
    }
    public int searchInsert(int[] nums, int target) {
        return binarySaerch(nums, target, 0, nums.length-1);
    }
}