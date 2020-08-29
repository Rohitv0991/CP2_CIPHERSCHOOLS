/*Sort a linked list in O(n log n) time using constant space complexity.*/

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
 
//https://leetcode.com/problems/sort-list/submissions/
 
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode slow = head, fast = head, pre = null;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }
        
        pre.next = null;
        
        ListNode h1 = sortList(head);
        ListNode h2 = sortList(slow);
        
        return merge(h1, h2);
    }
    
    public ListNode merge(ListNode h1, ListNode h2) {
        ListNode result = new ListNode(0), temp = result;
        
        while(h1 != null && h2 != null) {
            if(h1.val > h2.val) {
                temp.next = h2;
                h2 = h2.next;
            }
            else {
                temp.next = h1;
                h1 = h1.next;
            }
            temp = temp.next;
        }
        
        if(h1 == null) temp.next = h2;
        if(h2 == null) temp.next = h1;
        
        return result.next;
    }
}