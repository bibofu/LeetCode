

/**
 * @author fubibo
 * @create 2021-02-24 11:20
 */

/**
 * 输入两棵二叉树A，B，判断B 是不是A 的子结构。（ps：我们约定空
 * 树不是任意一个树的子结构）
 */
public class Q18 {
    public static void main(String[] args) {
        TreeNode a1=new TreeNode(3);
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


        TreeNode b1=new TreeNode(1);
        TreeNode b2=new TreeNode(2);
        TreeNode b3=new TreeNode(5);
        TreeNode b4=new TreeNode(6);
        TreeNode b5=new TreeNode(8);
        b1.left=b2;
        b1.right=b3;
        b2.left=b4;
        b2.right=b5;

        System.out.println(hasSubtree(a1,b1));


    }



    public static boolean ifContain(TreeNode a,TreeNode b){

        if (a==null&&b==null){
            return true;
        }

        if (a==null||b==null){
            return false;
        }

        if (a.val!=b.val){
            return false;
        }

        return ifContain(a.left,b.left)&&ifContain(a.right,b.right);

    }

    public static boolean hasSubtree(TreeNode a,TreeNode b){
        if (b==null){
            return true;
        }
        if (a==null){
            return false;
        }

        if (ifContain(a,b)){
            return true;
        }

        return hasSubtree(a.left,b)||hasSubtree(a.right,b);
    }


}
