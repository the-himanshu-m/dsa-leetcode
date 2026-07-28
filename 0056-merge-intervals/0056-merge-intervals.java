import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[][] merge(int[][] arr) {

        if (arr.length == 0) return new int[0][];

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int first = arr[0][0];
        int sec = arr[0][1];
        ArrayList<int[]> ans = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (sec >= arr[i][0]) {
                sec = Math.max(sec, arr[i][1]);
            } else {
                ans.add(new int[]{first, sec});
                first = arr[i][0];
                sec = arr[i][1];
            }
        }

        ans.add(new int[]{first, sec});

        return ans.toArray(new int[ans.size()][]);
    }
} 