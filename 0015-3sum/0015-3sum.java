class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int start = i + 1, end = nums.length - 1;

            while (start < end) {

                int sum = nums[start] + nums[end] + nums[i];
                
                if (sum < 0) {
                    start++;
                } else if (sum > 0) {
                    end--;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;

                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }

                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                }
            }
        }

        return ans;
    }
}