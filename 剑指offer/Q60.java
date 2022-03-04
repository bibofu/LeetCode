package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:55
 */

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺
 * 序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，依此
 * 类推。
 */
public class Q60 {
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


        System.out.println(print(a1));
    }
    public static List<List<Integer>> print(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        if (root==null){
            return null;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int depth=0;
        while(q.size()!=0){
            LinkedList<Integer> temp=new LinkedList<>();
            int size=q.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = q.poll();
                if (depth%2==0){
                    temp.offer(poll.val);
                }else{
                    temp.addFirst(poll.val);
                }
                if (poll.left!=null){
                    q.offer(poll.left);
                }
                if (poll.right!=null){
                    q.offer(poll.right);
                }

            }
            res.add(temp);
            depth++;

        }

        return res;


    }


}
