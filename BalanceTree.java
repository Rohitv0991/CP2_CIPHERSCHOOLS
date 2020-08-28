/*
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the left and right subtrees of every node differ in height by no more than 1.*/

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
 
 //https://leetcode.com/problems/balanced-binary-tree/submissions/
 
class Solution {
    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        
        return result;
    }
    
    public int height(TreeNode root) {
        if(root == null || result == false) return 0;
        
        int l = height(root.left);
        int r = height(root.right);
        
        if(Math.abs(l-r) > 1) result = false;
        
        return (1 + Math.max(l, r));
    }
}