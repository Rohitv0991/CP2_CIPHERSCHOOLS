/*Given a linked list, return the node where the cycle begins. 
If there is no cycle, return null.

Note: Do not modify the linked list.

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1 */

//https://leetcode.com/problems/linked-list-cycle-ii/

/*
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null || head.next == null) return null;
        // we used fast and slow pointer approach
        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            // now it is confirmed there is a cycle
            if(slow == fast) {
                ListNode slow2 = head;
                
                // where slow and slow2 will meet that is our result
                while(slow != slow2) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        // if outer loop terminates, means no cycle
        return null;
    }
}
