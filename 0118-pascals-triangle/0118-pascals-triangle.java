class Solution {
    public List<Integer> row(int row) {
        List<Integer> current = new ArrayList<>();
        int ans = 1;
        current.add(ans);

        for (int col = 1; col < row; col++) {
            ans *= (row - col);
            ans /= col;
            current.add(ans);
        }
        
        return current;
    }

    public List<List<Integer>> generate(int num) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            ans.add(new ArrayList<>(row(i)));
        }

        return ans;
    }
}