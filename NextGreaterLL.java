/*
We are given a linked list with head as the first node.
Let's number the nodes in the list: node_1, node_2, node_3, ... etc.

Each node may have a next larger value:
for node_i, next_larger(node_i) is the node_j.val such that j > i, node_j.val > node_i.val
and j is the smallest possible choice.

If such a j does not exist, the next larger value is 0.

Return an array of integers answer, where answer[i] = next_larger(node_{i+1}).

Example 1:

Input: [2,1,5]
Output: [5,5,0]
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 
 //https://leetcode.com/problems/next-greater-node-in-linked-list/
 
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        
        int arr[] = new int[list.size()];
        for(int i = 0; i < list.size(); ++i) {
            while(!st.isEmpty() && list.get(st.peek()) < list.get(i))
                arr[st.pop()] = list.get(i);
            st.push(i);
        }
        return arr;
    }
}

