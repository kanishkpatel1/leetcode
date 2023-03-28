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


// WE use approach first we find the inorder of the tree and store it in an array list and in  a BST the values in the tree will be ascending order so if they not then return false
class Solution {
    public boolean isValidBST(TreeNode root) {
                List<Integer> ls=new ArrayList<>();
        
        inorder(root,ls); // calling helper method 
        System.out.println(ls);
        for(int i=0;i<ls.size()-1;i++){
            if(ls.get(i)>=ls.get(i+1)){
                return false;
            }
        }
        return true;
        
    }

      public  void inorder(TreeNode root,List<Integer> ls){   // calling helper method 
         if(root==null){
            return ;
        }
        inorder(root.left,ls);
       
        ls.add(root.val);
        
        inorder(root.right,ls);
        }
    }
