class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        return helper(nums, 0, ans, new ArrayList<Integer>());
    }

    private List<List<Integer>> helper (int[] nums, int index, List<List<Integer>> ans, List<Integer> current) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return ans;
        }
            
        current.add(nums[index]);
        helper(nums, index + 1, ans, current);
        current.removeLast();

        int idx = index + 1;
        while (idx < nums.length && nums[idx] == nums[idx - 1]) {
            idx++;
        }

        helper(nums, idx, ans, current);

        return ans;
    }
}