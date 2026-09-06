class Solution {
    public int minMoves(int target, int max) {
        return helper(target, max, 0);
    }

    private int helper(int target, int max, int steps) {
        if (target == 1) return steps;
        if (max == 0) return steps + (target - 1);

        if (target % 2 == 0 && max > 0) return helper(target / 2, max - 1, steps + 1);
        return helper(target - 1, max, steps + 1);
    }
}