package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:22
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Q23 {
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

        System.out.println(PrintFromTopToBottom(a1));

    }

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return list;
    }
}
