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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> ls1=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();
        inorder(p,ls1);
        inorder(q,ls2);
        return ls1.equals(ls2);
    }
    
    public void inorder(TreeNode a,List<Integer> ls){
        if(a==null){
            return;
        }
        inorder(a.left,ls);
        ls.add(a.val);
        inorder(a.right,ls);
        if(a.left==null){
            ls.add(null);
        }
        if(a.right==null){
            ls.add(null);
        }
    }
}