// Last updated: 1/22/2026, 8:40:07 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character> set = new HashSet<>();
4        int left = 0, maxLen = 0;
5
6        for (int right = 0; right < s.length(); right++) {
7            while (set.contains(s.charAt(right))) {
8                set.remove(s.charAt(left));
9                left++;
10            }
11            set.add(s.charAt(right));
12            maxLen = Math.max(maxLen, right - left + 1);
13        }
14        return maxLen;
15    }
16}
17