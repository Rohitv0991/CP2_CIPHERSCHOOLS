/*Given a BST,  and a reference to a Node x in the BST.
Find the Inorder Successor of the given node in the BST.

Example:
Input:
             20
            /   \
           8     22
          / \
         4   12
            /  \
           10   14

K(data of x) = 8

Output: 10

Explanation:Inorder traversal: 4 8 10 12 14 20 22
Hence successor of 8 is 10*/

//https://www.geeksforgeeks.org/inorder-successor-in-binary-search-tree/

/**
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/

class Tree
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
    {
	  if(x.right != null) {
		  x = x.right;
		  while(x.left != null)
			  x = x.left;
		  return x;
	  }
	  
	  Node successor = null;
	  while(root != null) {
		  if(x.data < root.data){
			  successor = root;
			  root = root.left;
		  }
		  else if(x.data > root.data) root = root.right;
		  else break;
	  }
	  return successor;
    }
}