class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1, smallest = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + (end - start)/2;
            smallest = Math.min(smallest, nums[mid]);

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return smallest; 
    }
}