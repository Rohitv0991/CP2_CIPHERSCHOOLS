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
    public ListNode sortList(ListNode head) {
        if(head == null) return head;
        ArrayList<Integer> data = new ArrayList<>();
        int count = 0;
        ListNode temp = null;
        
        while(head != null) {
            data.add(head.val);
            head = head.next;
            count++;
        }
        Collections.sort(data);
        temp = new ListNode(data.get(0));
        head = temp;
        for(int i = 1; i < count; i++) {
            ListNode t = new ListNode(data.get(i));
            temp.next = t;
            temp = temp.next;
        }
        temp = null;
        
        return head;
    }
}
