class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int currSum = nums[start] + nums[i] + nums[end];
                if (Math.abs(target - currSum) < diff) {
                    diff = Math.abs(target - currSum);
                    ans = currSum;
                }

                if (currSum <= target) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return (ans == Integer.MAX_VALUE) ? 0 : ans;
    }
}