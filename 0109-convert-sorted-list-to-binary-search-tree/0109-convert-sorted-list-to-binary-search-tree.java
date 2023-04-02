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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// Que 1382  --> 108--> 109 are same logic based 
class Solution {
    List<Integer> ls=new ArrayList<>();
    public TreeNode sortedListToBST(ListNode head) {
        
        
        while(head!=null){
            ls.add(head.val);
            head=head.next;
        }
        int start=0;
        int end=ls.size()-1;
        return createBBST(start,end);
        
    }
    
      public TreeNode createBBST(int start,int end){
        if(start>end){
            return null;
        }
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(ls.get(mid));
        root.left=createBBST(start,mid-1);
        root.right=createBBST(mid+1,end);
        
        return root;
    }
}