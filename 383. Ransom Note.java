class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<String> magazineList = new LinkedList<>(Arrays.asList(magazine.split("")));
        for (int i=0;i<ransomNote.length();i++) {
            if (magazineList.contains(String.valueOf(ransomNote.charAt(i)))) {
                magazineList.remove(String.valueOf(ransomNote.charAt(i)));
            } else {
                return false;
            }
        }
        return true;
    }
}