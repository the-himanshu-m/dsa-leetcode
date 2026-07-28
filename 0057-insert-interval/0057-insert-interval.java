class Solution {
    public int[][] insert(int[][] nums, int[] insert) {

        int first = insert[0];
        int sec = insert[1];

        if (nums.length == 0) return new int[][]{{first, sec}};

        int i = 0;

        ArrayList<int[]> ans = new ArrayList<>();

        while (i < nums.length && nums[i][1] < first) {
            ans.add(new int[] {nums[i][0], nums[i][1]});
            i++;
        }

        while (i < nums.length && nums[i][0] <= sec) {
            first = Math.min(nums[i][0], first);
            sec = Math.max(nums[i][1], sec);

            i++;
        }

        ans.add(new int[] {first, sec});

        while (i < nums.length) {
            ans.add(new int[] {nums[i][0], nums[i][1]});
            i++;
        }

       return ans.toArray(new int[ans.size()][]);
    }
}