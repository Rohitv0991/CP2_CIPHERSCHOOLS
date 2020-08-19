/*Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed.

Example:

Given: 1->2->3->4
Return: 2->1->4->3.*/

//https://leetcode.com/problems/swap-nodes-in-pairs/
/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode newHead = head.next, cur = head, nex = head.next, pre = null;
        
        while(cur != null && nex != null){
            cur.next  = nex.next;
            nex.next = cur;
            
            if(pre != null) pre.next = nex;
            if(cur.next == null) break;
            
            pre = cur;
            cur = cur.next;
            nex = cur.next;
        }
        
        return newHead;
    }
}
