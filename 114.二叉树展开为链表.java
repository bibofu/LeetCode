/*
 * @lc app=leetcode.cn id=114 lang=java
 *
 * [114] 二叉树展开为链表
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
    public void flatten(TreeNode root) {
        if(root==null){
            return ;
        }

        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
            if(!stack.isEmpty()){
                node.right=stack.peek();
            }
            node.left=null;

        }
    }
}
// @lc code=end

