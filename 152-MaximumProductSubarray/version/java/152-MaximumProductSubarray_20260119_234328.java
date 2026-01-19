// Last updated: 1/19/2026, 11:43:28 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max = nums[0];
4        int min = nums[0];
5        int ans = nums[0];
6
7        for (int i = 1; i < nums.length; i++) {
8            if (nums[i] < 0) {
9                int temp = max;
10                max = min;
11                min = temp;
12            }
13
14            max = Math.max(nums[i], max * nums[i]);
15            min = Math.min(nums[i], min * nums[i]);
16
17            ans = Math.max(ans, max);
18        }
19
20        return ans;
21    }
22}