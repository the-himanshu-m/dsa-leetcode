class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        permute(nums, 0, ans);
        return ans;
    }

    private void permute (int[] nums, int index, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> current = new ArrayList<>();
            for(int num : nums) {
                current.add(num);
            }
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            boolean duplicate = false;

            for (int j = index; j < i; j++) {
                if (nums[j] == nums[i]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) continue;

            swap(nums, index, i);
            permute(nums, index + 1, ans);
            swap(nums, index, i);
        }
    }

    private void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}