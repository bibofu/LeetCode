

/**
 * @author fubibo
 * @create 2021-02-24 11:21
 */

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 */
public class Q19 {
    public static void main(String[] args) {
        TreeNode a1=new TreeNode(0);
        TreeNode a2=new TreeNode(1);
        TreeNode a3=new TreeNode(4);
        TreeNode a4=new TreeNode(2);
        TreeNode a5=new TreeNode(5);
        TreeNode a6=new TreeNode(7);
        TreeNode a7=new TreeNode(6);
        TreeNode a8=new TreeNode(8);
        a1.left=a2;
        a1.right=a3;
        a2.left=a4;
        a2.right=a5;
        a3.right=a6;
        a4.left=a7;
        a4.right=a8;

        mirror(a1);

        BinaryTree tree=new BinaryTree();
        tree.setRoot(a1);
        tree.preOrder();


    }

    public static void mirror(TreeNode root){
        if (root!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            mirror(root.left);
            mirror(root.right);
        }
    }

}
