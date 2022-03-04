package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:37
 */

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向
 */
public class Q27 {
    public static void main(String[] args) {


    }

    public static TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode lastlist = covertNode(pRootOfTree,null);
        TreeNode pHead = lastlist;

        while (pHead != null && pHead.left != null) {
            pHead = pHead.left;
        }
        return pHead;
    }



    public static TreeNode covertNode(TreeNode root, TreeNode lastlist) {
        if (root == null)
            return null;
        TreeNode cur = root;
        if (cur.left != null) {
            lastlist = covertNode(cur.left,lastlist);
        }cur.left = lastlist;
        if (lastlist != null) {
            lastlist.right = cur;
        }lastlist = cur;
        if (cur.right != null) {
            lastlist = covertNode(cur.right,lastlist);
        }return lastlist;
    }
}
