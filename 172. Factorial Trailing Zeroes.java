class Solution {
    public int trailingZeroes(int n) {
        int result = 0;
        if (n>4) {
            for (int i=n;i>0;i--) {
                if (i%5==0) {
                    result++;
                }
                double temp = i;
                while (temp>5) {
                    temp/=5;
                    if (temp%5==0) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}