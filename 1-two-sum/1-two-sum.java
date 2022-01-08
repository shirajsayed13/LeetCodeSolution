class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int fn = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int sn = nums[j];
                if(target == fn + sn) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
        
    }
}