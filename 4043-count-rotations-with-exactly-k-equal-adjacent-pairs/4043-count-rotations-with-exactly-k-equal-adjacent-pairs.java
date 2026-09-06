class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int count = 0;

        for (int start = 0; start < n; start++) {
            if (check(s, start, k, n)) count++;
        }

        return count;
    }

    private boolean check (String s, int start, int k, int n) {
        int count = 0, current = start;

        for (int i = 0; i < n - 1; i++) {
            int next = (current + 1) % n;
            if (s.charAt(current) == s.charAt(next)) count++;
            if (count > k) return false;
            current = next;
        }

        return (count == k);
    }
}