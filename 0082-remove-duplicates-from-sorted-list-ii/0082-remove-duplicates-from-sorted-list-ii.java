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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p=head;
        ListNode pas=new ListNode(0);
        ListNode res=pas;
        while(p!=null){
            if(p.next!=null && p.val==p.next.val){
                while(p.next!=null && p.val==p.next.val){
                    p=p.next;
                }
            }
            else{
                res.next=p;
                res=res.next;
            }
            p=p.next;
        }
        res.next=null;
        return pas.next;
    }
}