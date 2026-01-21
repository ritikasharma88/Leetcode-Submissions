// Last updated: 1/21/2026, 10:30:32 PM
1import java.util.*;
2class Solution {
3    public int[] intersect(int[] nums1, int[] nums2) {
4        Map<Integer, Integer> map = new HashMap<>();
5        for (int num : nums1) {
6            map.put(num, map.getOrDefault(num, 0) + 1);
7        }
8        List<Integer> result = new ArrayList<>();
9        for (int num : nums2) {
10            if (map.containsKey(num) && map.get(num) > 0) {
11                result.add(num);
12                map.put(num, map.get(num) - 1);
13            }
14        }
15        int[] ans = new int[result.size()];
16        for (int i = 0; i < result.size(); i++) {
17            ans[i] = result.get(i);
18        }
19        return ans;
20    }
21}