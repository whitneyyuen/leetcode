class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        while (temp>=10) {
            String tempStr = String.valueOf(temp);
            temp = 0;
            for (int i=0;i<tempStr.length();i++) {
                temp+=Math.pow(Character.getNumericValue(tempStr.charAt(i)),2);
            }
        }
        if (temp==1 ||temp==7) {
            return true;
        } else {
            return false;
        }
    }
}