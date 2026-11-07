class Solution {
    public int subarraySum(int[] nums, int k) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i];
            if (sum == k) ans++;
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) ans++;
            }
        }
        if (nums[nums.length - 1] == k) ans++;

        return ans;
    }
}