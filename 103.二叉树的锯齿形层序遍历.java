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
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            LinkedList<Integer> l=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(level%2==0){
                    l.add(node.val);
                }else{
                    l.addFirst(node.val);
                }
                
                if(node.left!=null){
                    q.offer(node.left);
                }
                
                if(node.right!=null){
                    q.offer(node.right);
                }
                
            }
            res.add(l);
            level++;
        }
        
        return res;
        
    }
}
// @lc code=end

