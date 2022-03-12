/*
 * @lc app=leetcode.cn id=590 lang=java
 *
 * [590] N 叉树的后序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        
        //后序遍历，左右根
        LinkedList<Integer> res=new LinkedList<>();
        if(root==null){
            return res;
        }
        
        //根右左反过来
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node=stack.pop();;
            res.addFirst(node.val);
            if(node.children!=null&&node.children.size()!=0){
                for(Node n:node.children){
                    stack.push(n);
                }
            }
        }
        
        
        return res;
        
    }
}
// @lc code=end

