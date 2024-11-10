class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int result = count;
        if (nums.length>0) {
            int prev = nums[0];
            for (int i=1;i<nums.length;i++) {
                if (prev+1==nums[i]) {
                    count++;
                } else {
                    if (prev != nums[i]) {
                        if (count>result) {
                            result = count;
                        }
                        count = 1;
                    }
                }
                prev = nums[i];
            }
            if (count>result) {
                result = count;
            }
        } else {
            result = 0;
        }
        return result;
    }
}