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
class Solution {
    int ans=0;
    public TreeNode convertBST(TreeNode root) {
    if(root!=null){
        convertBST(root.right);
        ans+=root.val; // store the sum 
        root.val=ans;   // then change the value of r
        convertBST(root.left);
        }
        return root;
    }
}