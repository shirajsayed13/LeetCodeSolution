class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length -1; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                map.put(nums[i], ++count);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        int max = -1;
        int res = -1;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }
}