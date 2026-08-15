class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1, end = largest(nums);

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (valid(nums, mid, threshold)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private boolean valid(int[] nums, int divisor, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double)num/divisor);

            if (sum > threshold) return false;
        }

        return true;
    }

    private int largest (int[] nums) {
        int largest = 1;
        for (int num : nums) {
            largest = Math.max(largest, num);
        }

        return largest;
    }
}