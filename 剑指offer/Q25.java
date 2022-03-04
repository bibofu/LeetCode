package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:36
 */

import org.junit.Test;

import java.util.ArrayList;

/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数
 * 的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一
 * 条路径。
 */
public class Q25 {
    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target)
    {
        if (root == null) {
            return listAll;
        }
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            listAll.add(new ArrayList<>(list));
        }

        FindPath(root.left, target);
        FindPath(root.right, target);
        // 回退
        list.remove(list.size() - 1);

        return listAll;
    }

    @Test
    public void test(){
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

        System.out.println(FindPath(a1,14));
    }
}
