package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 16:55
 */

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序
 * 列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5
 * 是某栈的压入顺序，序列4，5,3,2,1 是该压栈序列对应的一个弹出序列，但
 * 4,3,5,1,2 就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等
 * 的）
 *
 * 判断标准：出栈序列中，元素i之后所有比i小的元素间必须是降序排列的。
 */
public class Q22 {
    public static void main(String[] args) {
        int[] push={1,2,3,4,5};
        int[] pop={4,5,3,2,1};
        System.out.println(isPopList(push,pop));

    }

    public static boolean isPopList(int[] push,int[] pop){
        if(push==null||pop==null){
            return false;
        }

        Stack<Integer> stack=new Stack<>();

        int index=0;

        for (int i=0;i<push.length ; i++) {
            stack.push(push[i]);
            while (!stack.isEmpty() && stack.peek() == pop[index]) {
                stack.pop();
                index++;
            }

        }
        return stack.isEmpty();



    }
}
