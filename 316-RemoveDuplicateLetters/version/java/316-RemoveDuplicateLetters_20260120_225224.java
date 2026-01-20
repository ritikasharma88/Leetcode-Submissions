// Last updated: 1/20/2026, 10:52:24 PM
1class Solution {
2    public String removeDuplicateLetters(String s) {
3        int[] freq = new int[26];
4        boolean[] used = new boolean[26];
5
6        for (char c : s.toCharArray()) {
7            freq[c - 'a']++;
8        }
9
10        StringBuilder stack = new StringBuilder();
11
12        for (char c : s.toCharArray()) {
13            int idx = c - 'a';
14            freq[idx]--;
15
16            if (used[idx]) continue;
17            while (stack.length() > 0) {
18                char last = stack.charAt(stack.length() - 1);
19                if (last > c && freq[last - 'a'] > 0) {
20                    used[last - 'a'] = false;
21                    stack.deleteCharAt(stack.length() - 1);
22                } else {
23                    break;
24                }
25            }
26
27            stack.append(c);
28            used[idx] = true;
29        }
30
31        return stack.toString();
32    }
33}