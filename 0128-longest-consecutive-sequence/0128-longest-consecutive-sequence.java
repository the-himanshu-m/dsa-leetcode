class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        int longest = Integer.MIN_VALUE, start = nums[0];

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int current = 0, length = 1;

        for (int num : set) {

            if (!set.contains(num - 1)) start = num;

            if (num == start) {
                current = start;
                length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}