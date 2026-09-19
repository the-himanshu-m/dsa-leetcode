class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        return helper(nums, 0, ans, new ArrayList<Integer>());
    }

    private List<List<Integer>> helper (int[] nums, int index, List<List<Integer>> ans, List<Integer> current) {
        if (index >= nums.length) {
            ans.add(new ArrayList<>(current));
            return ans;
        }

        current.add(nums[index]);
        helper(nums, index + 1, ans, current);
        current.remove(current.size() - 1);
        helper(nums, index + 1, ans, current);

        return ans;
    }
}