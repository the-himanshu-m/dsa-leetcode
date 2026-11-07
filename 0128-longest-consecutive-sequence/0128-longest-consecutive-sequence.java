class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int longest = 1;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (set.contains(num - 1)) continue;

            int first = num, count = 1;
            while (set.contains(first + 1)) {
                count++;
                first++;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }
}