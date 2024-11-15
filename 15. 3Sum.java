class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		for (int i=0;i<nums.length-2;i++) {
			for (int j=i+1;j<nums.length-1;j++) {
				for (int k=j+1;k<nums.length;k++) {
					if (nums[i]+nums[j]+nums[k]==0) {
						List<Integer> tempList = new ArrayList<Integer>();
						tempList.add(nums[i]);
						tempList.add(nums[j]);
						tempList.add(nums[k]);
						boolean containInd = false;
						for (List<Integer> l: resultList) {
							if (l.get(0)==tempList.get(0) &&
								l.get(1)==tempList.get(1) &&
								l.get(2)==tempList.get(2)) {
								containInd = true;
							}
						}
						if (!containInd) {
							resultList.add(tempList);
						}
					}
				}
			}
		}
		return resultList;
	}
}