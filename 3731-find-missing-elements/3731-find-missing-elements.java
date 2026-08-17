import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        
        Set<Integer> numSet = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            smallest = Math.min(smallest, num);
            largest = Math.max(largest, num);
            numSet.add(num);
        }

        while (smallest <= largest) {
            if (!numSet.contains(smallest)) {
                ans.add(smallest);
            }
            smallest++;
        }

        return ans;
    }
}
