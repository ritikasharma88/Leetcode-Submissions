// Last updated: 1/20/2026, 10:49:51 PM
1import java.util.*;
2
3class Solution {
4    public boolean wordPattern(String pattern, String s) {
5        String[] words = s.split(" ");
6        if (pattern.length() != words.length) {
7            return false;
8        }
9
10        Map<Character, String> charToWord = new HashMap<>();
11        Map<String, Character> wordToChar = new HashMap<>();
12
13        for (int i = 0; i < pattern.length(); i++) {
14            char ch = pattern.charAt(i);
15            String word = words[i];
16
17            if (charToWord.containsKey(ch)) {
18                if (!charToWord.get(ch).equals(word)) {
19                    return false;
20                }
21            } else {
22                if (wordToChar.containsKey(word)) {
23                    return false;
24                }
25                charToWord.put(ch, word);
26                wordToChar.put(word, ch);
27            }
28        }
29
30        return true;
31    }
32}