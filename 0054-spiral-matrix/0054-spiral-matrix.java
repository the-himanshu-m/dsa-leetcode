class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        List<Integer> ans = new ArrayList<>();

        int n = nums.length, m = nums[0].length;
        int top = 0, left = 0, bottom = n - 1, right = m - 1;

        while (top <= bottom && left <= right) {
            //right
            for (int i = left; i <= right; i++) {
                ans.add(nums[top][i]);
            }
            top++;

            //bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(nums[i][right]);
            }
            right--;

            //left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(nums[bottom][i]);
                }
                bottom--;
            }

            //top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(nums[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}