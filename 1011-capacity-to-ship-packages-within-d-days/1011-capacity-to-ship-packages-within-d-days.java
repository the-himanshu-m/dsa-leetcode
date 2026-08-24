class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = Integer.MIN_VALUE, end = 0;

        for (int weight : weights) {
            start = Math.max(start, weight);
            end += weight;
        }

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (valid(weights, mid, days)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private boolean valid (int[] nums, int ans, int totalDays) {
        int days = 1, weight = 0;

        for (int i = 0; i < nums.length; i++) {
            if (weight + nums[i] <= ans) {
                weight += nums[i];
            } else {
                weight = nums[i];
                days++;
            }
        }

        return days <= totalDays;
    }
}