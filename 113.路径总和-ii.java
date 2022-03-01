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
   
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> temp=new ArrayList<>();

        dfs(root,targetSum,0,temp);

        return res;
    }

    public void dfs(TreeNode root,int targetSum,int sum,List<Integer> temp){
        if(root==null){
            return;
        }
        temp.add(root.val);
        if(sum+root.val==targetSum&&root.left==null&&root.right==null){
            res.add(new ArrayList<>(temp));
        }
        dfs(root.left,targetSum,sum+root.val,temp);
        dfs(root.right,targetSum,sum+root.val,temp);
        temp.remove(temp.size()-1);
    }
}
// @lc code=end

