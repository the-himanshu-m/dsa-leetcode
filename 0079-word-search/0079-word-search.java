class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        int k = word.length();

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (wordSearch(board, row, col, word, 0)) return true;
            }
        }

        return false;
    }

    private boolean wordSearch(char[][] board, int row, int col, String word, int exp) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(exp)) return false;
        if (exp == word.length() - 1) return true;

        char temp = board[row][col];
        board[row][col] = '0';

        boolean ans1 = wordSearch(board, row, col - 1, word, exp + 1);
        boolean ans2 = wordSearch(board, row - 1, col, word, exp + 1);
        boolean ans3 = wordSearch(board, row, col + 1, word, exp + 1);
        boolean ans4 = wordSearch(board, row + 1, col, word, exp + 1);
        board[row][col] = temp;

        return ans1 || ans2 || ans3 || ans4;
    }
}