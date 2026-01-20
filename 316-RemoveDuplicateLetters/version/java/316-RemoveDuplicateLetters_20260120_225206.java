// Last updated: 1/20/2026, 10:52:06 PM
1class Solution {
2    public String removeDuplicateLetters(String s) {
3        int[] freq = new int[26];
4        boolean[] used = new boolean[26];
5
6        // Count frequency
7        for (char c : s.toCharArray()) {
8            freq[c - 'a']++;
9        }
10
11        StringBuilder stack = new StringBuilder();
12
13        for (char c : s.toCharArray()) {
14            int idx = c - 'a';
15            freq[idx]--;
16
17            if (used[idx]) continue;
18
19            // Maintain lexicographical order
20            while (stack.length() > 0) {
21                char last = stack.charAt(stack.length() - 1);
22                if (last > c && freq[last - 'a'] > 0) {
23                    used[last - 'a'] = false;
24                    stack.deleteCharAt(stack.length() - 1);
25                } else {
26                    break;
27                }
28            }
29
30            stack.append(c);
31            used[idx] = true;
32        }
33
34        return stack.toString();
35    }
36}