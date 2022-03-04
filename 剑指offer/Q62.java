package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:56
 */

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 */

/**
 * 思路：序列化：前序遍历二叉树存入字符串中；反序列化：根据前序遍历重建二
 * 叉树。
 */
public class Q62 {
    public static void main(String[] args) {


    }
    public String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        if (root == null){
            sb.append("#,");
            return sb.toString();
        }sb.append(root.val + ",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    public int index = -1;
    public TreeNode Deserialize(String str) {
        index++;
        int len = str.length();
        String[] strr = str.split(",");
        TreeNode node = null;
        if (index >= len)
            return null;
        if (!strr[index].equals("#")){
            node = new TreeNode(Integer.valueOf(strr[index]));
            node.left = Deserialize(str);

            node.right = Deserialize(str);
        }return node;
    }
}
