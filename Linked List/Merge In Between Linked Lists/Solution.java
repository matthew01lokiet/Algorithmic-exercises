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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        int size = 0;
        
        ListNode current = list1;
        
        ListNode beforeInsert = null;
        ListNode afterInsert = null;
        
        while(true)
        {
            if(size == a - 1)
            {
                beforeInsert = current;
                current = current.next;
                size++;
            }
            else if(size == b + 1)
            {
                afterInsert = current;
                break;
            }
            else
            {
                current = current.next;
                size++;
            }
        }
        
        /////////////////////////
        
        ListNode current2 = list2;
        
        beforeInsert.next = list2;
        
        while(true)
        {
            if(list2.next == null)
            {
                list2.next = afterInsert;
                break;
            }
            else
            {
                list2 = list2.next;
            }
        }
        
        return list1;
        
        
        
    }
    
    
}