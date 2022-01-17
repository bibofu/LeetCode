/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
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
    public boolean isValidBST(TreeNode root) {

        return helper(root,Long.MAX_VALUE,Long.MIN_VALUE);

    }

    public boolean helper(TreeNode root,long max,long min){
        if(root==null){
            return true;
        }

        boolean left=helper(root.left,root.val,min);

        if(root.val<=min||root.val>=max){
            return false;
        }



        boolean right=helper(root.right,max,root.val);

        return left&&right;
    }
}
// @lc code=end

