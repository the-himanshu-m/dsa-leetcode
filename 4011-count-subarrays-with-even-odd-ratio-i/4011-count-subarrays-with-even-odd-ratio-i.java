class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int even = 0, odd = 0;
            if (nums[i] % 2 == 0) {
                even++;
            } else {
                odd++;
                ans++;
            }

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

                if (even * b <= odd * a) ans++;
            }
        }

        return ans;
    }
}