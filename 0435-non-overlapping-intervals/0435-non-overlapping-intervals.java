class Solution{
        public int eraseOverlapIntervals(int[][] a) {
        Arrays.sort(a, (x, y) -> x[1] - y[1]);
        int end = a[0][1], ans = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i][0] < end)
                ans++;
            else
                end = a[i][1];
        }
        return ans;
    }
    }
