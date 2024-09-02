class Solution {
    public boolean isIsomorphic(String s, String t) {
        String tempS = "";
        String tempT = "";
        int countS = 0;
        int countT = 0;
        for (int i=0;i<s.length();i++) {
            if (!s.substring(0,i).contains(s.substring(i,i+1))) {
                tempS+=String.valueOf(countS);
                countS++;
            } else {
                int positionS = s.indexOf(s.substring(i,i+1));
                tempS+=tempS.substring(positionS,positionS+1);
            }
            if (!t.substring(0,i).contains(t.substring(i,i+1))) {
                tempT+=String.valueOf(countT);
                countT++;
            } else {
                int positionT = t.indexOf(t.substring(i,i+1));
                tempT+=tempT.substring(positionT,positionT+1);
            }
        }
        if (tempT.equals(tempS)) {
            return true;
        } else {
            return false;
        }
    }
}