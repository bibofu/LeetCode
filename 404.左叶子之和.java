/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
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
    public int sumOfLeftLeaves(TreeNode root) {
        return root!=null?dfs(root):0;
    }
    /* node为根节点的子树左叶子之和 */
    public int dfs(TreeNode node){
        int res = 0;
        if(node.left!=null){
            res+=isLeafNode(node.left)?node.left.val:dfs(node.left);
        }
        if(node.right!=null && !isLeafNode(node.right)){
            res+=dfs(node.right);
        }

        return res;
    }
    public boolean isLeafNode(TreeNode node){
        return node.left==null && node.right==null;
    }
}
// @lc code=end

