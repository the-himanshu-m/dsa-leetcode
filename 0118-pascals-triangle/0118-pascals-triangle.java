class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int row = 0; row < num; row++) {
            List<Integer> rowNums = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                rowNums.add(combinations(row, col));
            }
            ans.add(rowNums);
        }

        return ans;
    }

    private int combinations (int row, int col) {
        if (col > row/2) {
            col = row - col;
        }
        long ans = 1;
        for (int i = 0; i < col; i++) {
            ans *= row - i;
            ans /= i + 1;
        }

        return (int)ans;
    }
}