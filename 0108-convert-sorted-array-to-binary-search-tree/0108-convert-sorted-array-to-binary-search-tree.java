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
    public TreeNode sortedArrayToBST(int[] nums) {
        int start=0;
        int end=nums.length-1;
        return createBST(start,end,nums);
    }
    public TreeNode createBST(int start,int end,int[] nums){
        if(start>end){
            return null;
        }
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=createBST(start,mid-1,nums);
        root.right=createBST(mid+1,end,nums);
        return root;
    }
}