class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int fi = -1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                fi = mid;
                right = mid - 1;
            }
        }
        int leftL = 0;
        int rightL = nums.length - 1;
        int li = -1;
        while(leftL <= rightL) {
            int mid = (leftL + rightL) / 2;
            if(target > nums[mid]) {
                leftL = mid + 1;
            } else if (target < nums[mid]) {
                rightL = mid - 1;
            } else {
                li = mid;
                leftL = mid + 1;
            }
        }
        int[] arr = {fi, li};
        return arr;
    }
}