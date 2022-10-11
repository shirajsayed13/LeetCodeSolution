class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int[] arr = new int[nums.length];
        int idx = nums.length - 1;
        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                arr[idx--] = nums[i] * nums[i];
                i++;
            } else {
                arr[idx--] = nums[j] * nums[j];
                j--;
            }
        }
        return arr;
    }
}