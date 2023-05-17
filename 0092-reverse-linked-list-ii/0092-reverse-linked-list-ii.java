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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode ptr = head;
        Stack<Integer> stk = new Stack<>();
        int count = 0;
        while (ptr != null) {
            count++;
            if (count >= left && count <= right) {
                stk.push(ptr.val);
            }
            ptr = ptr.next;
        }
        count = 0;
        ptr=head;
        while(ptr!=null){
            count++;
             if (count >= left && count <= right) {
               
                ptr.val=stk.pop();
            }
            ptr = ptr.next;
        }
        return head;
    }
}
