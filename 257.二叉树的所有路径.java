/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    
    List<String> res=new ArrayList<>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        String temp=""+root.val+"->";
        dfs(root,temp);
        return res;
        

    }
    
    public void dfs(TreeNode root,String temp){
        if(root.left==null&&root.right==null){
            res.add(new String(temp.substring(0,temp.length()-2)));
            return ;
        }
        
        if(root.left!=null){
            dfs(root.left,temp+Integer.valueOf(root.left.val)+"->");
        }
        
        if(root.right!=null){
            dfs(root.right,temp+Integer.valueOf(root.right.val)+"->");
        }
    }
}
// @lc code=end

