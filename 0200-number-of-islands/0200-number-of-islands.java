class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == '1') {
                    countIsland(grid, row, col);
                    count++;
                }
            }
        }

        return count;
    }

    private void countIsland(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || grid[row][col] != '1') return;

        grid[row][col] = '0';

        countIsland(grid, row - 1, col);
        countIsland(grid, row, col + 1);
        countIsland(grid, row + 1, col);
        countIsland(grid, row, col - 1);
    }
}