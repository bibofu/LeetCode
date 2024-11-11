/*
 * @lc app=leetcode.cn id=337 lang=java
 *
 * [337] 打家劫舍 III
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
    public int rob(TreeNode root) {
        
        //两个状态，可能抢了root，也可能没抢
        int[] res=helper(root);
        return Math.max(res[0],res[1]);

    }
    
    public int[] helper(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        
        int[] left=helper(root.left);
        int[] right=helper(root.right);
        int[] res=new int[2];
        //res[0]表示没抢root 的最大值，res[1]表示抢了root
        res[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        res[1]=root.val+left[0]+right[0];
        
        return res;
    }
}
// @lc code=end

