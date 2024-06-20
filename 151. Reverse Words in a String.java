class Solution {
    public String reverseWords(String s) {
        String result = "";
        String[] sArr = s.trim().split("\\s+");
        for (int i=sArr.length-1;i>=0;i--) {
            result += sArr[i];
            if (i!=0) {
                result += " ";
            }
        }
        return result;
    }
}