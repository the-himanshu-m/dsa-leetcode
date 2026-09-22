class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(n, k, 1, ans, new ArrayList<>());
        return ans;
    }

    private void helper (int n, int k, int index, List<List<Integer>> ans, ArrayList<Integer> current) {
        if (current.size() == k) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i <= n; i++) {
            current.add(i);
            helper(n, k, i + 1, ans, current);
            current.removeLast();
        }
    }
}