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
 
 //https://leetcode.com/problems/insert-into-a-binary-search-tree/
 
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root==null)return new TreeNode(val);
        else insertIntoCurrentSubTree(root, val);
        return root;
    }
    
    public void insertIntoCurrentSubTree(TreeNode root, int val) {
        if (root.val>val){
            if (root.left==null)root.left=new TreeNode(val);
            else insertIntoCurrentSubTree(root.left, val);
        }
        else if (root.val<val){
            if (root.right==null)root.right=new TreeNode(val);
            else insertIntoCurrentSubTree(root.right, val);
        }
    }
}
