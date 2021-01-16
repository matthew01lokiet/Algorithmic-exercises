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
    public ListNode reverseList(ListNode head) {
        
        if(head == null)
            return null;
        
        if(head.next == null)
            return head;
        
        ListNode current = head;
        
        ListNode previous = null;
        ListNode next = null;
        
        while(true)
        {
            next = current.next;
            current.next = previous;
            
            if(next == null)
                break;
            
            previous = current;
            
            current = next;
            
        }
        
        return current;
        
    }
}