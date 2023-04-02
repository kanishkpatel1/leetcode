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
//Que 1382  --> 108--> 109 are same logic based 
class Solution {
     List<TreeNode> ls=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
       helper(root);
        int start=0;
        int end=ls.size()-1;
      return  createBBST(start,end);
        
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        ls.add(root);
        helper(root.right);
    }
    
    public TreeNode createBBST(int start,int end){
        if(start>end){
            return null;
        }
        int mid=start+(end-start)/2;
        TreeNode root=ls.get(mid);
        root.left=createBBST(start,mid-1);
        root.right=createBBST(mid+1,end);
        
        return root;
    }
}