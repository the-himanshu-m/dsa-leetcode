import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[][] merge(int[][] arr) {

        if (arr.length == 0) return new int[0][];

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int start = arr[0][0];
        int end = arr[0][1];
        ArrayList<int[]> ans = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (end >= arr[i][0]) {
                end = Math.max(end, arr[i][1]);
            } else {
                ans.add(new int[] {start, end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        ans.add(new int[] {start, end});

        return ans.toArray(new int[ans.size()][]);
    }
}