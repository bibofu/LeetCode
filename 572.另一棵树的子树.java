/*
 * @lc app=leetcode.cn id=572 lang=java
 *
 * [572] 另一棵树的子树
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root==null){
            return false;
        }else if(helper(root,subRoot)){
            return true;
        }else{
            return helper(root.left,subRoot)||helper(root.right,subRoot);
        }

        

    }

    public boolean helper(TreeNode root,TreeNode subRoot){
        
        if(root==null&&subRoot==null){
            return true;
        }

        if(root==null||subRoot==null){
            return false;
        }

        if(root.val==subRoot.val){
            return helper(root.left,subRoot.left)&&helper(root.right,subRoot.right);
        }else{
            return false;
        }
    }
}
// @lc code=end

