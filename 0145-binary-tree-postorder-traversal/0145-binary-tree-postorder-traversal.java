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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        post(root,ls); // helper method
        return ls;
    }
    
    public void post(TreeNode root,List<Integer> ls){  // this is our helper method
        if(root==null){
            return;
            
        }
        post(root.left,ls);
        post(root.right,ls);
        ls.add(root.val);
    }
}