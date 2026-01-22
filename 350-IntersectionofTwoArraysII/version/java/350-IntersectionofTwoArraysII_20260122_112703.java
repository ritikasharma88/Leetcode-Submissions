// Last updated: 1/22/2026, 11:27:03 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> res= new ArrayList<>();
19        helper(root, res);
20        return res;
21        
22    }
23    private void helper(TreeNode node, List<Integer> list){
24        if (node == null){
25            return;
26        }
27        helper(node.left, list);
28        list.add(node.val);
29        helper( node.right, list);
30    }
31}