class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int min = 0;
        int max = numbers.length-1;
        do {
            if (numbers[min]+numbers[max]==target) {
                break;
            } else {
                if (numbers[min]+numbers[max]<target) {
                    min++;
                } else {
                    max--;
                }
            }
        } while (numbers[min]+numbers[max]!=target);
        result[0] = min+1;       
        result[1] = max+1;
        return result;
    }
}