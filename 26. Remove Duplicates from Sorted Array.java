class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int dup = 0;
        for (int i=0;i<nums.length;i++) {
            if (result.contains(nums[i])) {
                dup++;
            } else {
                result.add(nums[i]);
            }
        }
        for (int i=0;i<result.size();i++) {
            nums[i]=result.get(i);
            System.out.println(nums[i]);
        }
        return nums.length-dup;
    }
}