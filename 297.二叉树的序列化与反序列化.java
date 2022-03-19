/*
 * @lc app=leetcode.cn id=297 lang=java
 *
 * [297] 二叉树的序列化与反序列化
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

   // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        buildString(root,sb);
        return sb.toString();
        
    }

    public void buildString(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("#,");
            return;
        }
        sb.append(root.val);
        sb.append(",");
        buildString(root.left,sb);
        buildString(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> list=new LinkedList(Arrays.asList(data.split(",")));
        return buildTree(list);
    }

    public TreeNode buildTree(LinkedList<String> list){
        String first=list.removeFirst();
        if(first.equals("#")){
            return null;
        }
        TreeNode root=new TreeNode(Integer.valueOf(first));
        root.left=buildTree(list);
        root.right=buildTree(list);
        return root;
    }
    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
// @lc code=end

