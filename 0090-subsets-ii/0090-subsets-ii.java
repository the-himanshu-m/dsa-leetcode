class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        return helper(nums, 0, ans, new ArrayList<Integer>());
    }

    private List<List<Integer>> helper (int[] nums, int index, List<List<Integer>> ans, List<Integer> current) {
        ans.add(new ArrayList<>(current));
            
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;

            current.add(nums[i]);
            helper(nums, i + 1, ans, current);
            current.removeLast();
        }

        return ans;
    }
}