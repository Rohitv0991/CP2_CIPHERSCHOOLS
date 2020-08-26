/*In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.

Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.

Return true if and only if the nodes corresponding to the values x and y are cousins.*/

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
 
 //https://leetcode.com/problems/cousins-in-binary-tree/submissions/
 
class Solution {
    TreeNode xPar = null, yPar = null;
    int xDepth = -1, yDepth = -1;
    
    public boolean isCousins(TreeNode root, int x, int y) {
        finder(root, x, y, 0, null);
        return xDepth == yDepth && xPar != yPar;
    }
    
    public void finder(TreeNode root, int x, int y, int depth, TreeNode parent) {
        if(root == null) return;
        
        if(root.val == x) {
            xDepth = depth;
            xPar = parent;
        }
        else if(root.val == y) {
            yDepth = depth;
            yPar = parent;
        }
        else {
            finder(root.left, x, y, depth + 1, root);
            finder(root.right, x, y, depth + 1, root);
        }
    }
}