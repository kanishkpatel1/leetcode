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
