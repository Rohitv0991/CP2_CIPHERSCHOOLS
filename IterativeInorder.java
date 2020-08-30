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
 
// https://leetcode.com/problems/binary-tree-inorder-traversal/
 
class Solution {
   public List<Integer> inorderTraversal(TreeNode root) {
    Deque<TreeNode> stack = new ArrayDeque<>();
    List<Integer> result = new ArrayList<>();
    TreeNode curr = root;
    
    while (!stack.isEmpty() || curr != null) {
        if (curr != null) { 
            stack.addFirst(curr); 
            curr = curr.left; 
        } else { 
            curr = stack.removeFirst(); 
            result.add(curr.val);
            curr = curr.right; 
        }
    }
    return result;
}
}
