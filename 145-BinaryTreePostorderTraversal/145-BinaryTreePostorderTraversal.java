// Last updated: 1/19/2026, 10:36:09 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        print(root,ans);
        return ans;
    }
    public void print(TreeNode root, List<Integer> ans){
        if (root==null) return;
        print(root.left, ans);
        print(root.right, ans);
        ans.add(root.val);
    }
}