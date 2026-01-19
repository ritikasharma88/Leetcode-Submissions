// Last updated: 1/19/2026, 11:45:36 PM
1import java.util.*;
2class Solution {
3    public String largestNumber(int[] nums) {
4        String[] arr = new String[nums.length];
5        for (int i = 0; i < nums.length; i++) {
6            arr[i] = String.valueOf(nums[i]);
7        }
8
9        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
10        if (arr[0].equals("0")) {
11            return "0";
12        }
13        StringBuilder sb = new StringBuilder();
14        for (String s : arr) {
15            sb.append(s);
16        }
17        return sb.toString();
18    }
19}