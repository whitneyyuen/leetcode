class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArray = new int[(m+n)];
        int c1 = 0;
        int c2 = 0;
        int c = 0;
        while (c<(m+n)) {
            if (c1>=m) {
                newArray[c] = nums2[c2];
                c2++;
            } else if (c2>=n) {
                newArray[c] = nums1[c1];
                c1++;
            } else {
                if (nums1[c1]<nums2[c2]) {
                    newArray[c] = nums1[c1];
                    c1++;
                } else {
                    newArray[c] = nums2[c2];
                    c2++;
                }
            }
            c++;
        }
        for (int i=0;i<nums1.length;i++) {
            nums1[i] = newArray[i];
        }
    }
}