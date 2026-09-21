class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    private void helper (int[] nums, int index, int target, List<Integer> current, List<List<Integer>> ans) {
        if (target <= 0) {
            if (target == 0) ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < nums.length; i++) {

            if (i > index && nums[i] == nums[i - 1]) continue;

            current.add(nums[i]);
            helper(nums, i + 1, target - nums[i], current, ans);
            current.removeLast();
            // helper(nums, i + 1, target - nums[i], current, ans);
        }
    }
}