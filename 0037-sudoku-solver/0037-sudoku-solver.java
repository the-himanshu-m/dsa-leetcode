class Solution {
    public void solveSudoku(char[][] board) {
        sudoku(board, 0, 0);
    }

    private boolean sudoku(char[][] board, int row, int col) {
        if (row == 9) return true;
        if (col == 9) return sudoku(board, row + 1, 0);
        if (board[row][col] != '.') return sudoku(board, row, col + 1);

        for (char digit = '1'; digit <= '9'; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if (sudoku(board, row, col + 1)) return true;
                board[row][col] = '.';
            }
        }

        return false;
    }

    private boolean isSafe(char[][] board, int row, int col, int digit) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit) return false; // row check
            if (board[i][col] == digit) return false; // column check
        }

        //grid check
        int startRow = row - (row % 3);
        int startCol = col - (col % 3);

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == digit) return false;
            }
        }

        //correct
        return true;
    }
}