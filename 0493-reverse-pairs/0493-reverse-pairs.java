class Solution {
    public int reversePairs(int[] nums) {
        return divide(nums, 0, nums.length - 1);
    }

    private int divide (int[] nums, int start, int end) {
        if (start >= end) return 0; 

        int mid = start + (end - start)/2, count = 0;

        count += divide(nums, start, mid);
        count += divide(nums, mid + 1, end);
        count += conquer(nums, start, mid, end);

        return count;
    }

    private int conquer (int[] nums, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];
        int count = 0, j = mid + 1;

        for (int i = start; i <= mid; i++) {
            while (j <= end && nums[i] > 2L * nums[j]) {
                j++;
            }

            count += j - (mid + 1);
        }

        int i = start, k = 0;
        j = mid + 1;
        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j]) {
                merged[k++] = nums[i++];
            } else {
                merged[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            merged[k++] = nums[i++];
        }

        while (j <= end) {
            merged[k++] = nums[j++];
        }        

        for (int l = 0; l < merged.length; l++) {
            nums[start + l] = merged[l];
        }

        return count;
    }
}