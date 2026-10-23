class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> current = new ArrayList<>();

        helper(s, current, ans);
        return ans;
    }

    private void helper(String s, List<String> current, List<List<String>> ans) {
        int size = s.length();
        if (size == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < size; i++) {
            String part = s.substring(0, i + 1);

            if (isPalindrome(part)) {
                current.add(part);

                helper(s.substring(i + 1), current, ans);
                current.removeLast();
            }
        }
    }

    private boolean isPalindrome (String s) {
        int start = 0, end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }
}