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
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        inorder(root,ls);
        if(ls.size()==1){
            return -1;
        }
        Collections.sort(ls);
        return ls.get(1);
    }
    
     void inorder(TreeNode root,List<Integer> ls){
        if(root==null){
            return;
        }
        inorder(root.left,ls);
        if(!ls.contains(root.val)){
            ls.add(root.val);
        }
        inorder(root.right,ls);
    }
}