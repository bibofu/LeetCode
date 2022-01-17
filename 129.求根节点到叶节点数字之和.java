/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根节点到叶节点数字之和
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

    int sum=0;
    
    public int sumNumbers(TreeNode root) {

        dfs(root,root.val);
        return sum;

       
    }

    public void dfs(TreeNode root,int temp){
        if(root.left==null&&root.right==null){
            sum+=temp;
        }

        if(root.left!=null){
            dfs(root.left,temp*10+root.left.val);
        }

        if(root.right!=null){
            dfs(root.right,temp*10+root.right.val);
        }
    }

    
}
// @lc code=end

