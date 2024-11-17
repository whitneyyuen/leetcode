class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = nums.length+1;
        for (int i=0;i<nums.length;i++) {
            int total = 0;
            for (int j=i;j<nums.length && total<target;j++) {
                total+=nums[j];
                if (target<=total) {
                    if (min>(j-i+1)) {
                        min = j-i+1;
                    }
                }
            }
        }
        if (min>nums.length) {
            return 0;
        } else {
            return min;
        }
    }
}