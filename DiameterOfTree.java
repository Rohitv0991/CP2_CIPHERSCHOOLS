/*Given a binary tree, you need to compute the length of the diameter of the tree. 
The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
This path may or may not pass through the root.*/

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
 
//https://leetcode.com/problems/diameter-of-binary-tree/submissions/
 
class Solution {
    int d = 1;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
        helper(root);
        return d - 1;
    }
    
    public int helper(TreeNode root) {
        if (root == null) return 0;
        
        int left = helper(root.left);
        int right = helper(root.right);
     
        d = Math.max(d, left + right + 1);
        return Math.max(left, right) + 1;
    }

}