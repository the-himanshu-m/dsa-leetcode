class Solution {
    public int minMoves(int target, int max) {
        int steps = 0;
        while (target != 1) {
            if (max == 0) return steps + (target - 1);

            if (target % 2 == 0 && max > 0) {
                target /= 2;
                max--;
            } else {
                target--;
            }

            steps++;
        }

        return steps;
    }
}