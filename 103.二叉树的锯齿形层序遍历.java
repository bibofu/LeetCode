/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层序遍历
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int depth=0;

        while(!queue.isEmpty()){
            int size=queue.size();
            LinkedList<Integer> temp=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode pop=queue.poll();
                if(depth%2==0){
                    temp.add(pop.val);

                }else{
                    temp.addFirst(pop.val);
                }

                if(pop.left!=null){
                    queue.offer(pop.left);
                }

                if(pop.right!=null){
                    queue.offer(pop.right);
                }
            }

            res.add(temp);
            depth++;

        }

        return res;

    }
}
// @lc code=end

