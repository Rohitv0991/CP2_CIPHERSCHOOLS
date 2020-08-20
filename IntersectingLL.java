//Write a program to find the node at which the intersection of two singly linked lists begins.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
 //https://leetcode.com/problems/intersection-of-two-linked-lists/
 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        //set 2 temp pointers a and b
        ListNode a = headA;
        ListNode b = headB;
        
        //if they are not pointing at same address
        while(a != b) {
            
            //if a has reached end of list then set it at beginning of other list
            //else move it to next
            a = (a == null)?headB : a.next;
            
            // same for b
            b = (b == null)? headA : b.next;
        }
        
        return a;
		
	//naive approach

        /*while(a != null) {
            while(b != null){
                
                if(a == b) return a;
                
                b = b.next;
            }
            a = a.next;
            b = headB;
        }
        return null;*/
    }
}