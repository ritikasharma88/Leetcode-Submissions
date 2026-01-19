// Last updated: 1/19/2026, 10:35:51 PM
class Solution {
    public int firstUniqChar(String s) {
        int ind = -1;
        int n = s.length();
        int[] freq = new int[26];
        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            freq[c-'a']++;
        }
        for(int i = 0; i<s.length(); i++) if(freq[s.charAt(i)-'a']==1) return i;
        return ind;
    }
}