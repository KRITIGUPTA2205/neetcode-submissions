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
    public boolean isBalanced(TreeNode root) {
       return height(root)!=-1;

    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int l_h=height(root.left);
        if(l_h==-1) return -1;
        int r_h=height(root.right);
        if(r_h==-1) return -1;
        if(Math.abs(l_h-r_h)>1) return -1;
        return 1+Math.max(l_h,r_h);
    }

}
