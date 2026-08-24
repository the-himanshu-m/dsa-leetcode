class Solution {
    public int splitArray(int[] nums, int k) {
        if (k > nums.length) return -1;

        long start = 0, end = 0;

        for (long num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (valid(nums, mid, k)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (int)start;
    }

    private boolean valid (int[] nums, long ans, int k) {
        int pages = 0;
        int students = 1;
        for (int num : nums) {
            if (pages + num > ans) {
                students++;
                pages = num;
            } else {
                pages += num;
            }
        }

        return students <= k;
    }
}