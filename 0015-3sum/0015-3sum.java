import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        
        // 1. Sort the array
        Arrays.sort(nums);
        
        for (int i = 0; i < n - 2; i++) {
            // Pruning 1: If the smallest possible element is greater than 0, 
            // no three elements can sum up to 0. Break early.
            if (nums[i] > 0) {
                break;
            }
            
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Pruning 2: If nums[i] combined with the two smallest remaining elements 
            // is greater than 0, this i is already too big. Break early.
            if (nums[i] + nums[i + 1] + nums[i + 2] > 0) {
                break;
            }
            
            // Pruning 3: If nums[i] combined with the two absolute largest elements 
            // in the array is less than 0, this i is too small. Move to the next i.
            if (nums[i] + nums[n - 2] + nums[n - 1] < 0) {
                continue;
            }
            
            // Standard optimized two-pointer approach
            int start = i + 1;
            int end = n - 1;
            
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                
                if (sum < 0) {
                    start++;
                } else if (sum > 0) {
                    end--;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    
                    // Skip duplicates for start and end
                    while (start < end && nums[start] == nums[start + 1]) {
                        start++;
                    }
                    while (start < end && nums[end] == nums[end - 1]) {
                        end--;
                    }
                    
                    start++;
                    end--;
                }
            }
        }
        return ans;
    }
}
