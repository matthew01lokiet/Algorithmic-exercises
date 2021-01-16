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
        
        ListNode retNode = new ListNode();
        ListNode newNode = new ListNode();
        
        if(l1 != null && l2 != null && l1.val < l2.val)
        {
            newNode = l1;
            l1 = l1.next;
        }
        else if(l1 != null && l2 != null)
        {
            newNode = l2;
            l2 = l2.next;
        }
        else if(l1 == null && l2 == null)
        {
            return null;
        }
        else if(l1 == null)
        {
            newNode = l2;
            l2 = l2.next;
        }
        else if(l2 == null)
        {
            newNode = l1;
            l1 = l1.next;
        }
            
        
        retNode = newNode;
    
        
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                retNode.next = l1;
                retNode = retNode.next;
                l1 = l1.next;
            }
            else
            {
                retNode.next = l2;
                retNode = retNode.next;
                l2 = l2.next;
            }
        }
        
        if(l1 == null)
        {
            while(l2 != null)
            {
                retNode.next = l2;
                retNode = retNode.next;
                l2 = l2.next;
            }
        }
        else if(l2 == null)
        {
            while(l1 != null)
            {
                retNode.next = l1;
                retNode = retNode.next;
                l1 = l1.next;
            }
        }
        
        return newNode;
        
    }
}