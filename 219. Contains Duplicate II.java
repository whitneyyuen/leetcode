class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
         for (int i=0;i<nums.length;i++) {
            if (numMap.containsKey(nums[i])) {
                if (i-numMap.get(nums[i])<=k) {
                    return true;
                }
            }
            numMap.put(nums[i], i);
        }
        return false;
    }
}