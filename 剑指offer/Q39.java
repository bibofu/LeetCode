package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:43
 */

import org.junit.Test;

/**
 *
 */
public class Q39 {
    /**
     * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点
     * （含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
     */
    public int getDepth(TreeNode root){
        if (root==null){
            return 0;
        }

        int left=getDepth(root.left);
        int right=getDepth(root.right);

        return Math.max(left,right)+1;
    }


    /**
     * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
     */

    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }


        boolean condition = Math.abs(getDepth(root.left) - getDepth(root.right)) <= 1;


        return condition && isBalanced(root.left) && isBalanced(root.right);
    }

    @Test
    public void test(){
        TreeNode root=new TreeNode(0);
        TreeNode n1=new TreeNode(1);
        TreeNode n2=new TreeNode(2);
        TreeNode n3=new TreeNode(3);
        TreeNode n4=new TreeNode(4);
        TreeNode n5=new TreeNode(5);
        TreeNode n6=new TreeNode(6);
        root.left=n1;
        root.right=n2;
        n1.left=n3;
        n1.right=n4;
        n2.left=n5;
        n2.right=n6;

        System.out.println(getDepth(root));

        System.out.println(isBalanced(root));



    }





}
