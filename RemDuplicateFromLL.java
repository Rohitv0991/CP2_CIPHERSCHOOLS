/*Given a sorted linked list, delete all nodes that have duplicate numbers, 
leaving only distinct numbers from the original list.

Return the linked list sorted as well.

Example 1:

Input: 1->2->3->3->4->4->5
Output: 1->2->5*/


//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/


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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        // add a node with 0 value at head
        // so that we can set a prev pointer there
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        
        // initialize 2 pointers
        ListNode prev = newHead;
        ListNode cur = head;
        
        // boolean var to remember if elements are duplicate
        boolean repeat = false;
        
        while(cur.next != null) {
            // keep prev pointer before duplicate elements 
            // and cur pointer till last duplicate
            // will be repeated for every set of duplicates
            if(cur.val == cur.next.val) {
                cur = cur.next;
                repeat = true; //set true when we find duplicates
            }
            else {
                cur = cur.next;
                // 2) After duplicates are removed again move prev
                // before any other remaining duplicates
                if(!repeat) {
                    prev = prev.next;
                }
                // 1) deletes duplicates
                prev.next = cur;
                // set false as we have deleted one set of duplicates
                repeat = false; 
            }
        }
        // if last value was also part of a duplicate set
        // then delete it 
        if(repeat) prev.next = null;
        
        // don't return list with the inserted 0
        return newHead.next;
    }
}
