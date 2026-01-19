// Last updated: 1/19/2026, 10:53:45 PM
1class Solution {
2    public int maxSideLength(int[][] mat, int threshold) {
3        int m = mat.length, n = mat[0].length;
4        int[][] pre = new int[m + 1][n + 1];
5        for (int i = 1; i <= m; i++) {
6            for (int j = 1; j <= n; j++) {
7                pre[i][j] = mat[i - 1][j - 1]
8                          + pre[i - 1][j]
9                          + pre[i][j - 1]
10                          - pre[i - 1][j - 1];
11            }
12        }
13        int left = 1, right = Math.min(m, n);
14        int ans = 0;
15        while (left <= right) {
16            int mid = (left + right) / 2;
17
18            if (existsSquare(pre, m, n, mid, threshold)) {
19                ans = mid;
20                left = mid + 1;   
21            } else {
22                right = mid - 1; 
23            }
24        }
25        return ans;
26    }
27    private boolean existsSquare(int[][] pre, int m, int n, int k, int threshold) {
28        for (int i = 0; i + k <= m; i++) {
29            for (int j = 0; j + k <= n; j++) {
30                int sum = pre[i + k][j + k]
31                        - pre[i][j + k]
32                        - pre[i + k][j]
33                        + pre[i][j];
34                if (sum <= threshold) return true;
35            }
36        }
37        return false;
38    }
39}