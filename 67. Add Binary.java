class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int aLen = a.length();
        int bLen = b.length();
        int count = 0;
        int leading = 0;
        while (aLen>count || bLen>count) {
            int temp = leading;
            if (aLen>count && "1".equals(a.substring(aLen-count-1, aLen-count))) {
                temp++;
            }
            if (bLen>count && "1".equals(b.substring(bLen-count-1, bLen-count))) {
                temp++;
            }
            if (temp >= 2) {
                if (temp == 2) {
                    result.insert(0, "0");
                } else {
                    result.insert(0, "1");
                }
                leading = 1;
            } else {
                result.insert(0, String.valueOf(temp));
                leading = 0;
            }
            count++;
        }
        if (leading == 1) {
            result.insert(0, "1");
        }
        return result.toString();
    }
}