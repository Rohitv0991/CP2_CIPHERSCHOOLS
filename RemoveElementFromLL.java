/*Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5 */

//https://leetcode.com/problems/remove-linked-list-elements/submissions/

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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        
        ListNode cur = head;
        
        ListNode pre = new ListNode(-1);
        pre.next = head;
        head = pre;

       while(cur != null) {
           if(cur.val == val) pre.next = cur.next;
           else pre = pre.next;
           
           cur = cur.next;
       }
        
        return head.next;
    }
}
