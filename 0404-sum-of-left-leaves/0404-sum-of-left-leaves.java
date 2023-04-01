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
    public int sumOfLeftLeaves(TreeNode root) {
         int sum=0;
        if(root==null){
        return 0;    
        }
       Stack<TreeNode> stk=new Stack<>();
        stk.push(root);
        while(!stk.isEmpty()){
            TreeNode node=stk.pop();
        if(node.left!=null){
            if(node.left.left==null && node.left.right==null){
                sum+=node.left.val;
            }
            else{
                stk.push(node.left);
            }
             }
            if(node.right!=null){
                if(node.right.left!=null  || node.right.right!=null){
                    stk.push(node.right);
                }
            }
        }
        
        return sum;
    }
}