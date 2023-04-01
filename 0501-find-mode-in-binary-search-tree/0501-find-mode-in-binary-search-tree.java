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
    Integer prev = null;
    int cur = 1;
    int max = 0;

    public int[] findMode(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        inorder(root, ls); // calling helper method
        System.out.println(ls);

        int arr[] = new int[ls.size()];  // array for copying list data into it
        for (int i = 0; i < ls.size(); i++) {
            arr[i] = ls.get(i);
        }
        return arr;
    }

    public void inorder(TreeNode root, List<Integer> ls) { //helper method
        if (root == null) { // check base case
            return; }
        
        inorder(root.left, ls); // again go to it's left

        if (prev != null) { // if previous!=null then match curr value with previous and increase count
            if (prev == root.val) {
                cur++;
            } else { // if curr value not matched with prev then curr value is 1
                cur = 1;
            }
        }

        if (cur > max) { // if curr value is greater than max change the max and clear the list and add current node val in the list
            max = cur;
            ls.clear();
            ls.add(root.val);
        }
        else if(cur==max){  // if curr count and max count same then add curr node value also in the list
            ls.add(root.val);
        }
        
        prev = root.val; // make curr node prev
        
        inorder(root.right, ls); // again go to its right
    }
}
