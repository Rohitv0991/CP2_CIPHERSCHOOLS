/*Merge two sorted linked lists and return it as a new sorted list. 
The new list should be made by splicing together the nodes of the first two lists.*/

//https://leetcode.com/problems/merge-two-sorted-lists/submissions/

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return l1;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode t1 = l1, t2 = l2;
        ListNode res = new ListNode(0);
        ListNode temp = res;
        
        while(t1 != null && t2 != null) {
            if(t1.val <= t2.val) {
                temp.next = t1;
                t1 = t1.next;
            }
            else {
                temp.next = t2;
                t2 = t2.next;
            }
            
            temp = temp.next;
        }
        
        if(t1 == null) {
            while(t2 != null) {
                temp.next = t2;
                temp = temp.next;
                t2 = t2.next;
            }
        }
        
        if(t2 == null) {
            while(t1 != null) {
                temp.next = t1;
                temp = temp.next;
                t1 = t1.next;
            }
        }
        
        return res.next;
    }
}
