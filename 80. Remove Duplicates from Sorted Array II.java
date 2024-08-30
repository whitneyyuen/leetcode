class Solution {
    public int removeDuplicates(int[] nums) {
       if (nums.length<=2) {
            return nums.length;
       } else {
            int count = 0;
            boolean hitInd = false;
            int i = 1;
            while (i<nums.length-count) {
                if (nums[i]==nums[i-1]) {
                    if (hitInd) {
                        for (int j=i;j<nums.length-1-count;j++) {
                            nums[j] = nums[j+1];
                            System.out.println("j:"+j+",nums:"+nums[j]);
                        }
                        nums[nums.length-1-count] = nums[i];
                        count++;
                    } else {
                        hitInd = true;
                        i++;
                    }
                } else {
                    hitInd = false;
                    i++;
                } 
            }
            return nums.length-count;
        }
    }
}