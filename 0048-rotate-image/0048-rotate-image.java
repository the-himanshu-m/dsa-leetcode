class Solution {
    public void rotate(int[][] matrix) {
        for (int row = 0; row < matrix[0].length; row++) {
            for (int col = row + 1; col < matrix[0].length; col++) {
                swap(matrix, row, col);
            }
        }

        for (int row = 0; row < matrix[0].length; row++) {
            reverse(matrix, row, matrix[row].length - 1);
        }
    }

    private void swap (int[][]matrix, int row, int col) {
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][row];
        matrix[col][row] = temp;
    }

    private void reverse (int[][] matrix, int row, int end) {
        int start = 0;

        while (start < end) {
            int temp = matrix[row][end];
            matrix[row][end] = matrix[row][start];
            matrix[row][start] = temp;

            start++;
            end--;
        }
    }
}