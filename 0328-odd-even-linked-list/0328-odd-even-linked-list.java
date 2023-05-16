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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode oddIndx = head, evenIndx = head.next, evenHead = evenIndx;
        while(evenIndx != null && evenIndx.next != null) {
            oddIndx.next = evenIndx.next;
            oddIndx = oddIndx.next;
            evenIndx.next = oddIndx.next;
            evenIndx = evenIndx.next;
        }

        oddIndx.next = evenHead;
        return head;        
    }
} 
