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
    List<Integer> ls=new ArrayList<>();
    public boolean findTarget(TreeNode root, int target) {
        if(root==null){
            return false;
        }
        find(root);
        int arr[]=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            arr[i]=ls.get(i);
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                return true;
             }
            }
        }
        return false;
    }
    
    
    public void find(TreeNode root){
        if(root==null){
            return;
        }
        find(root.left);
        ls.add(root.val);
        find(root.right);
    }
}