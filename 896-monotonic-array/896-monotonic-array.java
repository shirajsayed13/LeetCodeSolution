class Solution {
    public boolean isMonotonic(int[] nums) {
        var isIncreasing = true;
        var isDecreasing = true;
        
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                isIncreasing = false;
            }
            if(nums[i] > nums[i + 1]) {
                isDecreasing = false;
            }
        }
        return isDecreasing || isIncreasing;
    }
}