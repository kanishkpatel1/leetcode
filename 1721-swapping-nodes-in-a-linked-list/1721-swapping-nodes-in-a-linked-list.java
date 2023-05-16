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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode itr=head;
        int count=1;
        while(count++<k){
            itr=itr.next;
        }
        ListNode first=itr;  // it will point to the kth value from starting 
        ListNode second=head;   
        while(itr.next!=null){ // when itr willl point to the null then second pointer will point to the n-k 
            //so after it swap the values of both first and second pointer 
            itr=itr.next; 
            second=second.next;
        }
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        
        return head;
    }
}