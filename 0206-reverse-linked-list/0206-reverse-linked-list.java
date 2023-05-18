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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head=prev;
        return head;
    }
}

// //method--> using stack
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode p=head;
//         Stack<Integer> stk=new Stack<>();
//         while(p!=null){
//             stk.push(p.val);
//             p=p.next;
//         }
//         p=head;
//         while(p!=null){
//             p.val=stk.pop();
//             p=p.next;
//         }
//         return head;
//     }
// }