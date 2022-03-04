

/**
 * @author fubibo
 * @create 2021-02-23 16:50
 */

import java.util.Arrays;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假
 * 设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列
 * {1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

class TreeNode{
    public int val;
    public TreeNode(int val){
        this.val=val;
    }
    TreeNode left;
    TreeNode right;

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }

    //编写前序遍历的方法
    public void preOrder() {
        System.out.println(this); //先输出父结点
        //递归向左子树前序遍历
        if(this.left != null) {
            this.left.preOrder();
        }
        //递归向右子树前序遍历
        if(this.right != null) {
            this.right.preOrder();
        }
    }
    //中序遍历
    public void infixOrder() {

        //递归向左子树中序遍历
        if(this.left != null) {
            this.left.infixOrder();
        }
        //输出父结点
        System.out.println(this);
        //递归向右子树中序遍历
        if(this.right != null) {
            this.right.infixOrder();
        }
    }
    //后序遍历
    public void postOrder() {
        if(this.left != null) {
            this.left.postOrder();
        }
        if(this.right != null) {
            this.right.postOrder();
        }
        System.out.println(this);
    }

}

//定义BinaryTree 二叉树
class BinaryTree {
    private TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }


    //前序遍历
    public void preOrder() {
        if(this.root != null) {
            this.root.preOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }

    //中序遍历
    public void infixOrder() {
        if(this.root != null) {
            this.root.infixOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    //后序遍历
    public void postOrder() {
        if(this.root != null) {
            this.root.postOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }


}












public class Q6 {
    public static void main(String[] args) {

    }

    public static TreeNode reCon(int[] pre,int[] mid){
        if (pre==null||mid==null||pre.length==0||mid.length==0){
            return null;
        }

        TreeNode root=new TreeNode(pre[0]);
        for (int i = 0; i < pre.length; i++) {
            if (pre[0]==mid[i]){
                root.left=reCon(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(mid,0,i));
                root.right=reCon(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(mid,i+1,mid.length));
            }

        }

        return root;
    }



}
