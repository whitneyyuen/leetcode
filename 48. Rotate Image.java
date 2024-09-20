class Solution {
    public void rotate(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix.length];
        for (int i=0;i<matrix.length;i++) {
            for (int j=matrix.length-1;j>=0;j--) {
                temp[i][matrix.length-1-j]=matrix[j][i];
            }
        }
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix.length;j++) {
                matrix[i][j] = temp[i][j];
            }
        }

    }
}