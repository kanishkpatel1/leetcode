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

//Method 1 :- Using array list and inorder traversal

// class Solution {
//     public int findSecondMinimumValue(TreeNode root) {
//         List<Integer> ls=new ArrayList<>();
//         inorder(root,ls);
//         if(ls.size()==1){
//             return -1;
//         }
//         Collections.sort(ls);
//         return ls.get(1);
//     }

//      void inorder(TreeNode root,List<Integer> ls){
//         if(root==null){
//             return;
//         }
//         inorder(root.left,ls);
//         if(!ls.contains(root.val)){
//             ls.add(root.val);
//         }
//         inorder(root.right,ls);
//     }
// }

// Method 2 :- Using two variables like we find second max in array
class Solution {
    int min = Integer.MAX_VALUE;
    boolean flag = false;
    int secondmin = Integer.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        find(root); // calling the helper function
        if (flag == false) { // if flag false after traverse all the tree it means there is no such elements so return false
            return -1;
        }
        return secondmin;
    }

    public void find(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.val < min) {  
            min = root.val;
        } else if (root.val > min && root.val <= secondmin) {  // if value of current node is greater than the minimum value and less than the second min value so change the value value of second minimum and flag becomes true as we find the second minimum
            secondmin = root.val;
            flag = true;
        }
        find(root.left);
        find(root.right);
    }
}
