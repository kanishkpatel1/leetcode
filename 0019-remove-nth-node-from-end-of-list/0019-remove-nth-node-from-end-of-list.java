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

// I use removefromNth Start code just changing  some lines first calculate length of the linked list and then subtact that from  n 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode p=head;
          while(p!=null){
            length++;
            p=p.next;
        }
        
        int position=length-n+1;
        if (position == 1) {
         head = head.next;
      } else {
         ListNode previous = head;
         int count = 1;
         while (count < position - 1) {
            previous = previous.next;
            count++;
         }

         ListNode current = previous.next;
         previous.next = current.next;
      }
        return head;
    }
}