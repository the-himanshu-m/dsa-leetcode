import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Use a Set of Lists to automatically filter out duplicate triplets
        Set<List<Integer>> res = new HashSet<>();
        // Keeps track of elements we have already processed as the first element 'nums[i]'
        Set<Integer> dups1 = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Skip if we have already looked for pairs using this exact starting number
            if (!dups1.add(nums[i])) continue;
            
            // This inner set acts as our 2Sum lookup map for the remaining elements
            Set<Integer> seen = new HashSet<>();
            
            for (int j = i + 1; j < nums.length; j++) {
                int complement = -nums[i] - nums[j];
                
                if (seen.contains(complement)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    // Sorting the individual triplet is mandatory so the HashSet 
                    // recognizes [-1, 0, 1] and [0, -1, 1] as identical items.
                    Collections.sort(triplet);
                    res.add(triplet);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }
}
