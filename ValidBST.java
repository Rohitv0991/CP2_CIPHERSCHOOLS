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
 
 //https://leetcode.com/problems/validate-binary-search-tree/
 
public class Solution {

    Stack<Integer> stack = new Stack<>();
    public void inOrder(TreeNode root){

        if(root != null){
            inOrder(root.left);
            stack.push(root.val);
            inOrder(root.right);
        }
    }
    
    public boolean isValidBST(TreeNode root){

        if(root == null) return true;

        inOrder(root);
        int i = stack.pop();

        while(!stack.isEmpty()){
            int j = stack.pop();
            if(i <= j) return false;
            i = j;
        }
        return true;
    }
}
