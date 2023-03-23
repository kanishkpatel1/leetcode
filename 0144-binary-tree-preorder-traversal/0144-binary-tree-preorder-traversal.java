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

// 1. Iterative Method 
// class Solution {
    
    
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> ls=new ArrayList<>();
//         Stack<TreeNode> st=new Stack();
//         if(root==null){
//         return ls;    
//         }
//         st.push(root);
//         while(!st.isEmpty()){
//             TreeNode n=st.pop();
//             ls.add(n.val);
//             if(n.right!=null){
//                 st.push(n.right);
//                 }
//             if(n.left!=null){
//                 st.push(n.left);
//             }
//         }
//             return ls;
//     }
// }


// Recursive method

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        if(root==null){
            return ls;
        }
        
        preorder(root,ls);
        return ls;
    }
    
    public void preorder(TreeNode root,List<Integer> ls){
        if(root==null){
            return;
        }
        ls.add(root.val);
        preorder(root.left,ls);
        preorder(root.right,ls);
    }
}