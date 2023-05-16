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
    public ListNode swapPairs(ListNode head) {
        ListNode p=head;
        List<Integer> ls=new ArrayList<>();
        while(p!=null){
            ls.add(p.val);
            p=p.next;
        }
        
        int n=ls.size();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ls.get(i);
            }
        for(int i=1;i<n;i=i+2){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        List<Integer> ls1=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            ls1.add(arr[i]);
        }
        ListNode q=null;
        for(int i=0;i<n;i++){
            ListNode p1=new ListNode(ls1.get(i));
            p1.next=q;
            q=p1;
            
        }
        return q;
    }
}