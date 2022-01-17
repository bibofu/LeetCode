/*
 * @lc app=leetcode.cn id=113 lang=java
 *
 * [113] 路径总和 II
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



    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, 0, targetSum);
        return res;
    }
    public void dfs(TreeNode root, int sum, int targetSum){
        if(root == null) return;
        sum += root.val;
        list.add(root.val);
        if(sum == targetSum && root.left == null && root.right == null){
            res.add(new ArrayList(list));
        }
        dfs(root.left, sum, targetSum);
        dfs(root.right, sum, targetSum);
        list.remove(list.size() - 1);
    }



    

}
// @lc code=end

