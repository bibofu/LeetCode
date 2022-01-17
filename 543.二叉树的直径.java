/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
 */

// @lc code=start
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
    public int diameterOfBinaryTree(TreeNode root) {

        if(root==null){
            return 0;
        }

        int res=depth(root.left)+depth(root.right);

        return Math.max(res,Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));



    }

    public int depth(TreeNode root){
        if(root==null){
            return 0;

        }

        int left=depth(root.left);
        int right=depth(root.right);

        return Math.max(left,right)+1;
    }
}
// @lc code=end

