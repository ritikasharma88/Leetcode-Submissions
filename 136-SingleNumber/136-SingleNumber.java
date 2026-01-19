// Last updated: 1/19/2026, 10:36:18 PM
public class Solution {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Single Number: " + solution.singleNumber(nums));  // Output: 4
    }
}