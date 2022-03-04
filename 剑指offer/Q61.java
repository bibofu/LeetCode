package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:55
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一
 * 行。
 */
public class Q61 {
    public static void main(String[] args) {

    }
    public static ArrayList<ArrayList<Integer>> printTree(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        ArrayList<Integer> tmp = new ArrayList<>();
        int start = 0;
        int end = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            tmp.add(node.val);

            start++;
            if (node.left != null) {
                queue.offer(node.left);
            }if (node.right != null) {
                queue.offer(node.right);
            }
            if (start == end) {
                start = 0;
                end = queue.size();
                res.add(new ArrayList<>(tmp));
                tmp.clear();
            }
        }return res;
    }

}
