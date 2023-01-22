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
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(0);
        ListNode high=new ListNode(0);
        ListNode s=small,h=high;
        while(head!=null){
            if(head.val<x){
                s.next=head;
                s=s.next;
            }
            else{
                h.next=head;
                h=h.next;
            }
            head=head.next;
        }
        h.next=null;
        s.next=high.next;
        
        return small.next;
    }
}