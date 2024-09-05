class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> resultList = new ArrayList<String>();
        String temp = "";
        int count = -1;
        int i=0;
        do {
            if (i<words.length && temp.length()+words[i].length()+count<maxWidth) {
                temp+=words[i];
                count++;
                i++;
            } else {
                String word = "";
                int totalSpace = maxWidth - temp.length();
                
                if (i>=words.length) {
                    if (count == 0) {                
                        word += words[i-1];
                        for (int k=0;k<totalSpace;k++) {
                            word += " ";
                        }
                    } else {
                        for (int j=i-count-1;j<i-1;j++) {
                            word += words[j] + " ";
                        }
                        word += words[i-1];
                        int remind = maxWidth-word.length();
                        for (int k=0;k<remind;k++) {
                            word += " ";
                        }                
                    }
                    resultList.add(word);
                    count = -1;
                    temp = "";
                    i++;
                } else {
                    if (count == 0) {                
                        word += words[i-1];
                        for (int k=0;k<totalSpace;k++) {
                            word += " ";
                        }
                    } else {
                        int ave = totalSpace/count;
                        int remind = totalSpace%count;
                        for (int j=i-count-1;j<i;j++) {
                            word += words[j];
                            if (j<i-1) {
                                for (int k=0;k<ave;k++) {
                                    word += " ";
                                }
                            }
                            if ((j-i+count+1)<remind) {
                                word += " ";
                                totalSpace--;
                            }
                            totalSpace-=ave;
                        }
                    }
                    resultList.add(word);
                    count = -1;
                    temp = "";
                }
            }
        } while (i<=words.length);
        return resultList;
    }
}