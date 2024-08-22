class Solution {
    public String convert(String s, int numRows) {
        String result = "";
        int repeat = numRows*2-2;
        if (repeat == 0) {
            result = s;
        } else {
            for (int i=0;i<numRows;i++) {
                for (int j=0;j<s.length();j++) {
                    if (j%repeat==i || j%repeat==(repeat-i)) {
                        result+=s.charAt(j);
                    }
                }
            }
        }
        return result;
    }
}