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
    public ListNode middleNode(ListNode head) {
        
        int size = 0;
        
        ListNode currentNode = head;
        
        while(currentNode != null)
        {
            size++;
            currentNode = currentNode.next;
        }
        
        int middleNode = size/2 + 1;
        
        int currentSize = 0;
        
        ListNode currentNode2 = head;
        
        ListNode nodeToRet = null;
        
        while(true)
        {
            currentSize++;
            
            if(currentSize == middleNode)
            {
                nodeToRet = currentNode2;
                break;
            }
            
            currentNode2 = currentNode2.next;
        }
        
        return nodeToRet;
        
        
    }
}