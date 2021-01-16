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
        
        if(head == null || (head.next == null && head.val == val))
            return null;
        
        ListNode currentNode = new ListNode();
        
        currentNode.next = head;
        
        ListNode tricky = currentNode;
        
        while(currentNode.next != null)
        {
            if(currentNode.next.val == val)
            {
                currentNode.next = currentNode.next.next;
            }
            else
            {
                currentNode = currentNode.next;
            }
        }
        
        return tricky.next;
    }
}