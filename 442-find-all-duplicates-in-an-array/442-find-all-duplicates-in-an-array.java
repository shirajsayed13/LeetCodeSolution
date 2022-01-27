class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                list.add(nums[i]);
            } else {
                map.put(nums[i], 1);
            }
        }
        return list;
    }
}