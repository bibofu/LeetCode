/*
 * @lc app=leetcode.cn id=173 lang=java
 *
 * [173] 二叉搜索树迭代器
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
class BSTIterator {

    TreeNode cur;
    Stack<TreeNode> stack;
    
    public BSTIterator(TreeNode root) {
        this.cur=root;
        this.stack=new Stack<>();

    }
    
    public int next() {
        while(cur!=null){
            stack.push(cur);
            cur=cur.left;
        }
        cur=stack.pop();
        int val=cur.val;
        cur=cur.right;
        return val;

    }
    
    public boolean hasNext() {
        if(!stack.isEmpty()||cur!=null){
            return true;
        }else{
            return false;
        }

    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end

