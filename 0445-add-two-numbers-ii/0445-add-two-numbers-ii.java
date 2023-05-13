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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       Stack<Integer> stk1=new Stack<>();
        Stack<Integer> stk2=new Stack<>();
        while(l1!=null){
            stk1.push(l1.val);
            l1=l1.next;
        }
         while(l2!=null){
            stk2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        ListNode ans=null;
       
        while(!stk1.isEmpty() || !stk2.isEmpty() || carry!=0){
            int sum=carry;
            if(!stk1.isEmpty()){
                sum+=stk1.pop();
                
            }
              if(!stk2.isEmpty()){
                sum+=stk2.pop();
            }
            ListNode n=new ListNode(sum%10);
            n.next=ans;
            ans=n;
            carry=sum/10;
        }
        return ans;
    }
}