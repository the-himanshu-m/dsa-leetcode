class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int start = j + 1, end = nums.length - 1;
                while (start < end) {
                    long currSum = (long)nums[i] + (long)nums[j] + (long)nums[start] + (long)nums[end];

                    if (currSum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        while (start < end && nums[start] == nums[start + 1]) {
                            start++;
                        }

                        while (end > start && nums[end] == nums[end - 1]) {
                            end--;
                        }

                        start++;
                        end--;
                    } else if (currSum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }

        return ans;
    }
}