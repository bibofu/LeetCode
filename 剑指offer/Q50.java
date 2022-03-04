package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:50
 */

/**
 * 给定一个二叉搜索树，输入两个节点，求树中两个节点的最低公共祖先
 */
public class Q50 {


    public TreeNode lowestAns(TreeNode root,TreeNode n1,TreeNode n2){
        if (root==null||n1==null||n2==null){
            return null;
        }
        int rootValue=root.val;
        int n1Value=n1.val;
        int n2Value=n2.val;
        if (n1Value>rootValue&&n2Value>rootValue){
            return lowestAns(root.right,n1,n2);
        }else if (n1Value<rootValue&&n2Value<rootValue){
            return lowestAns(root.left,n1,n2);
        }else {
            return root;
        }
    }
}
