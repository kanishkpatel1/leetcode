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
    public ListNode mergeKLists(ListNode[] lists) {
   PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
           while(lists[i]!=null){
               pq.offer(lists[i].val);
               lists[i]=lists[i].next;
            }
        }
        
        
            ListNode newHead = null;
        ListNode newTail = null;

        // Traverse the priority queue and create a new linked list with the nodes in sorted order
        while(!pq.isEmpty()){

            // Get the smallest element from the priority queue
            int val = pq.poll();

            // If it's the first node, create a new linked list
            if(newHead == null){
                ListNode temp = new ListNode(val);
                newHead = temp;
                newTail = temp;
            }
            // Otherwise, add it to the existing linked list
            else{
                ListNode temp = new ListNode(val);
                newTail.next = temp;
                newTail = newTail.next;
            }
        }

        // Set the next pointer of the last node to null
        if (newTail != null) {
            newTail.next = null;
        }

        // Return the new linked list
        return newHead;
        
    }  
    
        }
