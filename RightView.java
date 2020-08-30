/*Given a binary tree, imagine yourself standing on the right side of it, 
return the values of the nodes you can see ordered from top to bottom.

Example:

Input: [1,2,3,null,5,null,4]
Output: [1, 3, 4]
Explanation:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---*/

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
 
 //https://leetcode.com/problems/binary-tree-right-side-view/
 
class Solution {
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<Integer>();
        
        viewFinder(root, 0);
        return list;
    }
    
    public void viewFinder(TreeNode root, int depth) {
        if(root == null) return;
        
        if(list.size() == depth){
            list.add(root.val);
        }
        // at every depth add rightmost node if not available then add left node
        //if we change order of below statements then we get left view
        viewFinder(root.right, depth + 1);
        viewFinder(root.left, depth + 1);
    }
}