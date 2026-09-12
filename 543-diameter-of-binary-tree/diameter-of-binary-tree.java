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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int lh=checkHeight(root.left);
        int rh=checkHeight(root.right);
         max=Math.max(lh+rh,max);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
       return max;
    }
    int checkHeight(TreeNode node){
        if(node==null)return 0;
        int lh=checkHeight(node.left);
        int rh=checkHeight(node.right);
        
        return Math.max(lh,rh)+1;
    }
}