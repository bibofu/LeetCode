/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if(preorder.length==0||inorder.length==0||preorder.length!=inorder.length){
            return null;
        }

        TreeNode root=new TreeNode(preorder[0]);

        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==preorder[0]){
                root.left=buildTree(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
                root.right=buildTree(Arrays.copyOfRange(preorder,i+1,inorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
            }

            

        }

        return root;

    }
}
// @lc code=end

