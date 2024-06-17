public class TreeNode {
    int val;    
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Traversal{
    /**
     * 树的几种遍历
     */

    /** 前序遍历(根左右) */
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null){
            return res;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            res.add(temp.val);
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }

        return res;
    }
/***************************************** =============================================  */

    /** 中序遍历(左根右) */
    /** 递归，前中后序遍历都可以使用 */
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        helper(res,root);
        return res;
    }

    public void helper(List<Integer> res,TreeNode root){
        if(root == null){
            return;
        }
        helper(res,root.left);
        res.add(root.val);
        helper(res,root.right);
    }


    /**------------------------------------------------------ */
    /** 中序遍历(左根右)，使用栈来做 */
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
           return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur =root;
        stack.push(cur);
        while(cur!=null || !stack.isEmpty()){
            while(cur!=null){
                if(cur.left!=null){
                    stack.push(cur);
                    cur = cur.left;
                }
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }

/***************************************** =============================================  */

    public List<Integer> postorderTraversal(TreeNode root) {
        /** 后序遍历(左右根)，使用栈来做 */
        LinkedList<Integer> res = new LinkedList<>();
        if(root == null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            res.addFirst(node.val);
            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }

        }

        return res;
    }

/***************************************** =============================================  */
    public List<List<Integer>> levelOrder(TreeNode root) {
        /** 层序遍历，使用队列来做 */
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return res;
        }
        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();
            /** 表示一层 */
            for(int i = 0;i<size;i++){
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }   
            }
            
            res.add(temp);
        }
        return res;
    }

}
