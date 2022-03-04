package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:57
 */

/**
 * 给定一棵二叉搜索树，请找出其中的第k 小的结点
 */

import org.junit.Test;

/**
 * 思路：二叉搜索树按照中序遍历的顺序打印出来正好就是排序好的顺序，第k 个
 * 结点就是第K 大的节点，分别递归查找左右子树的第K 个节点，或使用非递归借
 * 用栈的方式查找，当count=k 时返回根节点。
 */
public class Q63 {
    @Test
    public void test(){

    }
    private int count = 0;
    public TreeNode KthNode(TreeNode pRoot, int k) {
        if(pRoot == null) {
            return null;
        }TreeNode node = KthNode(pRoot.left, k);
        if(node != null) {
            return node;
        }count++;
        if(count == k) {
            return pRoot;
        }node = KthNode(pRoot.right, k);
        return node;
    }
}
