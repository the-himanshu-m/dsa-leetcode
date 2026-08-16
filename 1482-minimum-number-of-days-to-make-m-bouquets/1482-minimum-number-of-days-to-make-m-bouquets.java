class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < 1L * m * k) return -1;
        int totalBouquets = 0;
        int start = 1, end = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            end = Math.max(end, bloomDay[i]);
        }

        while (start <= end) {
            int mid = start + (end - start)/2;
            
            if (bouquets(bloomDay, mid, m, k)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private boolean bouquets(int[] bloomDay, int day, int m, int k) {
        int count = 0, bouquet = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                count++;

                if (count == k) {
                    bouquet++;
                    count = 0;
                }
            } else {
                count = 0;
            }

            if (bouquet >= m) return true;
        }

        return false;
    }
}