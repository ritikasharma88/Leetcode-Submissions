// Last updated: 1/22/2026, 8:39:01 PM
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        for (int i = 0; i < nums.length - 1; i++) {
4            if (nums[i] == nums[i + 1]) return nums[i];
5            if (i + 2 < nums.length && nums[i] == nums[i + 2]) return nums[i];
6            if (i + 3 < nums.length && nums[i] == nums[i + 3]) return nums[i];
7        }
8        return -1;
9    }
10}
11