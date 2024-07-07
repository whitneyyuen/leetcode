class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char temp = ' ';
        for (int i=s.length()-1;i>=0;i--) {
            if (s.charAt(i)=='I') {
                if (temp=='V' || temp=='X') {
                    result -= 1;
                } else {
                    result += 1;
                }
                temp = s.charAt(i);
            } else if (s.charAt(i)=='V') {
                result += 5;
                temp = s.charAt(i);
            } else if (s.charAt(i)=='X') {
                if (temp=='L' || temp=='C') {
                    result -= 10;
                } else {
                    result += 10;
                }
                temp = s.charAt(i);
            } else if (s.charAt(i)=='L') {
                result += 50;
                temp = s.charAt(i);
            } else if (s.charAt(i)=='C') {
                if (temp=='D' || temp=='M') {
                    result -= 100;
                } else {
                    result += 100;
                }
                temp = s.charAt(i);
            } else if (s.charAt(i)=='D') {
                result += 500;
                temp = s.charAt(i);
            } else if (s.charAt(i)=='M') {
                result += 1000;
                temp = s.charAt(i);
            }
            
        }
        return result;
    }
}