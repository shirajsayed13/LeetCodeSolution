class Solution {
    public boolean isMonotonic(int[] nums) {
        var isIncreasing = true;
        var isDecreasing = true;
        
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                isIncreasing = false;
            }
            if(nums[i] > nums[i - 1]) {
                isDecreasing = false;
            }
        }
        return isDecreasing || isIncreasing;
    }
}