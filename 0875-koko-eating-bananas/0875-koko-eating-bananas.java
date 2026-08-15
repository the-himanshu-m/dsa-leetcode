class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int largest = 1;

        for (int pile : piles) {
            largest = Math.max(largest, pile);
        }

        int start = 1, end = largest;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (kokoCanDoIt(piles, mid, h)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    private boolean kokoCanDoIt (int[] piles, int speed, int h) {
        int sum = 0;
        for (int i = 0; i < piles.length; i++) {
            sum += (int) Math.ceil((double)piles[i]/speed);

            if (sum > h) return false;
        }

        return true;
    }
}