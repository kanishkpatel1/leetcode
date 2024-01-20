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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(6000); // dummy node 
        while(head!=null){
            ListNode next=head.next; 
            ListNode temp=dummy; 
    // because we will have to return the dummy's next so we cant traverse on dummy
            while(temp.next!=null && temp.next.val<head.val){
                temp=temp.next;
            }
            
            head.next=temp.next; // connect next node of head with the rest of temp node 
            temp.next=head; // add node in temp.next 
            head=next;  // change the head node 
        }
        return dummy.next;
    }
}