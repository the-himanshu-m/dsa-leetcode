class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        return helper(nums, 0, ans);
    }

    private List<List<Integer>> helper (int[] nums, int index, List<List<Integer>> ans) {
        if (index >= nums.length) {
            List<Integer> current = new ArrayList<>();
            for (int num : nums) {
                current.add(num);
            }
            ans.add(current);
            return ans;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            helper(nums, index + 1, ans);
            swap(nums, index, i);
        }

        return ans;
    }

    private void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}