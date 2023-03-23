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

// // 1. Recursive method
// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> ls=new ArrayList<>();
//         post(root,ls); // helper method
//         return ls;
//     }
    
//     public void post(TreeNode root,List<Integer> ls){  // this is our helper method
//         if(root==null){
//             return;
            
//         }
//         post(root.left,ls);
//         post(root.right,ls);
//         ls.add(root.val);
//     }
// }



// 2. Iterative Method

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        Stack<TreeNode> stk=new Stack<>();
        if(root==null){
            return ls;
        }
      //  List<Integer> ls=new ArrayList<>();
       
        stk.push(root);
        while(!stk.isEmpty()){
             TreeNode cur=stk.pop();
            
             ls.add(0,cur.val);
            if(cur.left!=null){
                stk.push(cur.left);
            }
            if(cur.right!=null){
                stk.push(cur.right);
            }
        }
        return ls;
    }
}