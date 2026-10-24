class Solution {
    public int majorityElement(int[] nums) {
        int vote = 1, candidate = nums[0], index = 1;

        while (index < nums.length) {
            if (nums[index] == candidate) {
                vote++;
            } else {
                vote--;
            }

            if (vote == 0) {
                vote++;
                candidate = nums[index];
            }

            index++;

            if (vote > nums.length/2) return candidate;
        }

        return candidate;
    }
}