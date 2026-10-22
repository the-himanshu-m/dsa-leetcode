class Solution {
    public boolean checkValidGrid(int[][] grid) {
        return knightsTour(grid, 0, 0, 0);
    }

    private boolean knightsTour(int[][] grid, int row, int col, int exp) {
        int n = grid.length;
        if (row < 0 || row >= n || col < 0 || col >= n || grid[row][col] != exp) return false;
        if (exp == n * n - 1) return true;

        boolean ans1 = knightsTour(grid, row - 1, col - 2, exp + 1);
        boolean ans2 = knightsTour(grid, row - 2, col - 1, exp + 1);
        boolean ans3 = knightsTour(grid, row - 2, col + 1, exp + 1);
        boolean ans4 = knightsTour(grid, row - 1, col + 2, exp + 1);
        boolean ans5 = knightsTour(grid, row + 1, col - 2, exp + 1);
        boolean ans6 = knightsTour(grid, row + 2, col - 1, exp + 1);
        boolean ans7 = knightsTour(grid, row + 2, col + 1, exp + 1);
        boolean ans8 = knightsTour(grid, row + 1, col + 2, exp + 1);

        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }
}