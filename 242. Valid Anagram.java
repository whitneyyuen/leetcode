class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) {
            return false;
        }
        String[] tSplit = t.split("");
        ArrayList<String> tList = new ArrayList<String>( 
            Arrays.asList(tSplit));
        for (int i=0;i<s.length();i++) {
            tList.remove(String.valueOf(s.charAt(i)));
        }
        if (tList.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}