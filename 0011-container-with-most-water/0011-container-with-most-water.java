class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0, end = height.length - 1;

        while (start < end) {
            int currArea = (end - start) * Math.min(height[end], height[start]);
            maxArea = Math.max(currArea, maxArea);

            if (height[start] <= height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxArea;
    }
}