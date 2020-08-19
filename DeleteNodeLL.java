/*Write a function to delete a node (except the tail) in a singly linked list, 
given only access to that node.*/

//https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
