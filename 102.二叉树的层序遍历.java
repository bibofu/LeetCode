/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                temp.add(node.val);

                if(node.left!=null){
                    queue.offer(node.left);
                }

                if(node.right!=null){
                    queue.offer(node.right);
                }

            }
            res.add(new ArrayList<>(temp));

        }

        return res;

    }
}

// @lc code=end

