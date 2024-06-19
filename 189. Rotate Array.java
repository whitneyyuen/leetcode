class Solution {
    public void rotate(int[] nums, int k) {
        int temp = 0;
        int count = k%nums.length;
        int first[] = (int[]) Arrays.copyOfRange(nums, nums.length-count, nums.length);
        int second[] = (int[]) Arrays.copyOfRange(nums, 0, nums.length-count);
        for (int i=0;i<first.length;i++) {
            nums[i] = first[i];
        }
        for (int i=0;i<second.length;i++) {
            nums[i+count] = second[i];
        }
    }
}