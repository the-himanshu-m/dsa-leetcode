class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMaxCal(height, leftMax);
        rightMaxCal(height, rightMax);

        return totalWater(height, leftMax, rightMax);
    }

    private void leftMaxCal(int[] height, int[] leftMax) {
        int left = 0;
        for (int i = 0; i < leftMax.length; i++) {
            left = Math.max(left, height[i]);
            leftMax[i] = left;
        }
    }

    private void rightMaxCal(int[] height, int[] rightMax) {
        int right = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            right = Math.max(right, height[i]);
            rightMax[i] = right;
        }
    }

    private int totalWater(int[] height, int[] leftMax, int[] rightMax) {
        int total = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.max(0, Math.min(leftMax[i], rightMax[i]) - height[i]);

            total += waterLevel;
        }

        return total;
    }
}