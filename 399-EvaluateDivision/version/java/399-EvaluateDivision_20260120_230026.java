// Last updated: 1/20/2026, 11:00:26 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder sb = new StringBuilder();
4        int count = 0;
5
6        for (int i = s.length() - 1; i >= 0; i--) {
7            char c = s.charAt(i);
8            if (c == '-') continue;
9
10            sb.append(Character.toUpperCase(c));
11            count++;
12
13            if (count == k) {
14                sb.append('-');
15                count = 0;
16            }
17        }
18
19     
20        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '-') {
21            sb.deleteCharAt(sb.length() - 1);
22        }
23
24        return sb.reverse().toString();
25    }
26}