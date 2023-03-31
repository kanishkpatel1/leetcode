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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        List<Integer> ls=new ArrayList<>();
        inorder(root,ls);
        for(int i=0;i<ls.size();i++){
            if(ls.get(i)<=high && ls.get(i)>=low){
                sum+=ls.get(i);
            }
        }
         return sum;
    }  
    void inorder(TreeNode root,List<Integer> ls){
        if(root==null){
            return;
        }
        inorder(root.left,ls);
        ls.add(root.val);
        inorder(root.right,ls);
       
    }
 }
