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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length=0;
        ListNode curr=head;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        int partSize=length/k;
        int extraNodes=length%k;
        ListNode []res=new ListNode[k];
        curr=head;
        // Loop throught each parts
        for(int i=0;i<k && curr!=null; i++){
            res[i]=curr;
            // partlength should be one extra if there exists extra nodes
            int partLength=partSize+(i<extraNodes?1:0);
            for(int j=0;j<partLength-1;j++){
                curr=curr.next;
            }
            ListNode temp=curr.next; // break the linked list
            curr.next=null;
            curr=temp;
            
        }
        return res;
    }
}