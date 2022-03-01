/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums.length==0){
            return null;
        }
        
        if(nums.length==1){
            return new TreeNode(nums[0]);
        }
        
        int i=nums.length/2;
        TreeNode root=new TreeNode(nums[i]);
        root.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,i));
        root.right=sortedArrayToBST(Arrays.copyOfRange(nums,i+1,nums.length));
        
        return root;

    }
}
// @lc code=end

