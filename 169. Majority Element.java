class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++) {
            if (numsMap.containsKey(nums[i])) {
                numsMap.put(nums[i],numsMap.get(nums[i])+1);
            } else {
                numsMap.put(nums[i],1);
            }
        }

        int max = 0;
        int result = 0;
        Iterator<Map.Entry<Integer, Integer>>iterator = numsMap.entrySet().iterator(); 
        while (iterator.hasNext()) { 
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (max < entry.getValue()) { 
                max = entry.getValue(); 
                result = entry.getKey();
            } 
        } 
        return result;
    }
}
