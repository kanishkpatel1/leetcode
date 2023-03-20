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

// Type 1 --> Recursive Approach

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        
        inorder(root,ls); // calling helper method 
        return ls;
        
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


// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> ls=new ArrayList<>();
//         Stack<TreeNode> st=new Stack<>();
        
        
//     }
// }