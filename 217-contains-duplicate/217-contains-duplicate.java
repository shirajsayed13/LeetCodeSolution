class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        boolean isDuplicate = false;
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                isDuplicate = true;
                map.put(nums[i], isDuplicate);    
                break;
            } else {
                isDuplicate = false;
                map.put(nums[i], isDuplicate);
            }
        }
        return isDuplicate;
    }
}