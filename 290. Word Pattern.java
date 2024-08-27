class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String, String> wordMap = new HashMap<String, String>();
        String[] splitS = s.split("\\s+");
        if (splitS.length!=pattern.length()) {
            return false;
        } else {
            for (int i=0;i<splitS.length;i++) {
                String p = String.valueOf(pattern.charAt(i));
                if (wordMap.containsKey(p)) {
                    if (!wordMap.get(p).equals(splitS[i])) {
                        return false;
                    }
                } else {
                    if (wordMap.containsValue(splitS[i])) {
                        return false;
                    } else {
                        wordMap.put(p, splitS[i]);
                    }
                }            
            }
        }
        return true;
    }
}