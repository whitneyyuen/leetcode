class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1]==9) {
            int count = digits.length-1;
            while (count>=0) {
                if (++digits[count]!=10) {
                    break;
                }
                digits[count] = 0;
                count--;
            }
            if (count<0) {
                int[] result = new int[digits.length+1];
                result[0] = 1;
                for (int i=0;i<digits.length-1;i++) {
                    result[i+1] = digits[i];
                }
                return result;
            } else {
                return digits;
            }
        } else {
            digits[digits.length-1] = digits[digits.length-1] + 1;
            return digits;
        }
    }
}