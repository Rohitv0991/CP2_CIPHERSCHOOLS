/*Given a binary tree, return the tilt of the whole tree.

The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values 
and the sum of all right subtree node values. Null node has tilt 0.

The tilt of the whole tree is defined as the sum of all nodes' tilt.*/

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
 
 //https://leetcode.com/problems/binary-tree-tilt/submissions/
 
class Solution {
    
    int tilt = 0;
    public int findTilt(TreeNode root) {
        helpMe(root);
        return tilt ;
    }
    
    public int helpMe(TreeNode root) {
        if(root == null) return 0;
        
        int left = helpMe(root.left);
        int right = helpMe(root.right);
        
        tilt += Math.abs(left - right);
        
        return left + right + root.val;
    }
}