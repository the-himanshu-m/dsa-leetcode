class Solution {
    public void rotate(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = row + 1; col < matrix[0].length; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[i].length - 1;

            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                
                start++;
                end--;
            }
        }
    }
}