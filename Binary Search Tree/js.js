// Binary search
var search = function(nums, target) {
    if(nums)
    return binarySaerch(nums,target, 0, nums.length);
};
var binarySaerch = function(nums, target, s, l){
    console.log(s>l);
    if(s>l)
        return -1;
    var m = Math.floor((s+l)/2);
    console.log(m);
    if(nums[m]=== target)
        return m;
    if(target< nums[m]){
        return binarySaerch(nums, target, s, m-1);
    }
    else return binarySaerch(nums, target, m+1,l);
}