/*
 * @lc app=leetcode.cn id=426 lang=java
 *
 * [426] 将二叉搜索树转化为排序的双向链表
 */

// @lc code=start
/*
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    public Node treeToDoublyList(Node root) {
        
        //中序遍历
        if(root==null){
            return null;
        }
        
        Deque<Node> stack=new ArrayDeque<>();
        
        Node pre=null;
        Node head=null;
        
        while(!stack.isEmpty()||root!=null){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            if(pre==null){
                head=root;
            }else{
                pre.right=root;
                root.left=pre;
            }
            
            pre=root;
            root=root.right;
                        
        }
        pre.right=head;
        head.left=pre;
        return head;
        
    }
}
// @lc code=end

