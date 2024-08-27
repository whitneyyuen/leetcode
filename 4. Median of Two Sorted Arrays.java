class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length+nums2.length];
        int c = 0;
        int c1 = 0;
        int c2 = 0;
        while (c<nums1.length+nums2.length) {
            if (c1>=nums1.length) {
                temp[c] = nums2[c2];
                c2++;
            } else if (c2>=nums2.length) {
                temp[c] = nums1[c1];
                c1++;
            } else {
                if (c1<nums1.length && nums1[c1]<nums2[c2]) {  
                    temp[c] = nums1[c1];
                    c1++;
                } else {
                    temp[c] = nums2[c2];
                    c2++;
                }
            }
            c++;
        }

        if (temp.length%2==0) {
            return (double)(temp[temp.length/2]+temp[temp.length/2-1])/2;
        } else {
            return temp[temp.length/2];
        }
    }
}