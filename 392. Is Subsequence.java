class Solution {
    public boolean isSubsequence(String s, String t) {
        
        String temp = "";
        int i = 0;
        for (int j = i; j<t.length(); j++) {
            if (i<s.length()) {
                if (s.charAt(i)==t.charAt(j)) {
                    temp += t.charAt(j);
                    i++;
                }
            } else {
                break;
            }
        }
        if (s.equals(temp)) {
            return true;
        } else {
            return false;
        }
    }
}