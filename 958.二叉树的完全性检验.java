/*
 * @lc app=leetcode.cn id=958 lang=java
 *
 * [958] 二叉树的完全性检验
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
    public boolean isCompleteTree(TreeNode root) {

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        boolean isReached=false;
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            if(isReached&&temp!=null){
                return false;
            }

            if(temp==null){
                isReached=true;
                continue;
            }
            queue.offer(temp.left);
            queue.offer(temp.right);
        }

        return true;



    }
}
// @lc code=end

