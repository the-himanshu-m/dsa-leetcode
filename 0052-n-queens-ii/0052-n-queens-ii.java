class Solution {
    public int totalNQueens(int n) {
        int[][] board = new int[n][n];
        return nQueens(board, 0, 0);
    }

    private int nQueens(int[][] board, int row, int ans) {
        if (row == board.length) {
            return 1;
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                count += nQueens(board, row + 1, ans);
                board[row][col] = 0; 
            }
        }

        return count;
    }

    private boolean isSafe(int[][] board, int row, int col) {
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 1) return false;
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }
}