/*Given a singly linked list, determine if it is a palindrome.

Example:

Input: 1->2
Output: false

Input: 1->2->2->1
Output: true

Follow up:
Could you do it in O(n) time and O(1) space?*/

//https://leetcode.com/problems/palindrome-linked-list/

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
    public boolean isPalindrome(ListNode head) {
		// if LL has one element only or is empty then return true
        if(head == null || head.next == null) return true;
		
		//adding a dummy node at head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
		//call checker method
        return checker(dummy,head);
    }
    
    static boolean checker(ListNode start, ListNode end) {
		//if reached last element return true
        if(end == null) return true;
        
		//moving end pointer to last element of LL
        boolean atLast = checker(start, end.next);
        
		//match value second node (coz 1st was a dummy node)
        boolean result = (start.next.val == end.val)?true:false;
        
		//update value of start
        start.next = start.next.next;
        
        return atLast && result;
    }
}