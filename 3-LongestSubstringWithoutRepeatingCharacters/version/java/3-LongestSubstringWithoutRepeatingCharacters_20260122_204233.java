// Last updated: 1/22/2026, 8:42:33 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        if (nums1.length > nums2.length)
4            return findMedianSortedArrays(nums2, nums1);
5
6        int m = nums1.length, n = nums2.length;
7        int low = 0, high = m;
8
9        while (low <= high) {
10            int cut1 = (low + high) / 2;
11            int cut2 = (m + n + 1) / 2 - cut1;
12
13            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
14            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
15
16            int right1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];
17            int right2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];
18
19            if (left1 <= right2 && left2 <= right1) {
20                if ((m + n) % 2 == 0)
21                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
22                else
23                    return Math.max(left1, left2);
24            } else if (left1 > right2) {
25                high = cut1 - 1;
26            } else {
27                low = cut1 + 1;
28            }
29        }
30        return 0.0;
31    }
32}
33