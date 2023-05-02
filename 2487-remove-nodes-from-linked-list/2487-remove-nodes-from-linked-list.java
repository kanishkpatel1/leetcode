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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stk=new Stack<>();
    
        
        ListNode p=head;
        while(p!=null){
            if(stk.size()==0){
            stk.add(p.val); }
            else{
                int curr=p.val;
                while(stk.size()>0 && stk.peek()<curr){
                    stk.pop();
                }
                stk.add(curr);
            }
           p=p.next; 
        }
        ListNode prev = null;
        ListNode curr = null;
        while(stk.size() > 0) {
            System.out.println(stk.peek());
            curr = new ListNode(stk.pop());
            curr.next=prev;
            prev=curr;
        }
        return curr;
    }
}