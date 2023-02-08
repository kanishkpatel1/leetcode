/**
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
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;  // here we find the there is a cycle so now fast pointer will be head to find where cycle exit 
            }
        }
        if(fast==null || fast.next==null) {
            return null;
        }
        
        fast=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;  // where fast==slow that is the end point of the cycle 
        }
        return fast;
    }
}