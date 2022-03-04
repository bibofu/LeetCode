package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 16:43
 */

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min
 * 函数。
 */
public class Q21 {

    public static Stack<Integer> stack1;
    public static Stack<Integer> stack2;

    public static void main(String[] args) {
//          Stack<Integer> stack=new Stack();
//          stack.push(4);
//          stack.push(3);
//          stack.push(5);
//        Integer peek = stack.peek();
//        System.out.println(peek);
    }

    public static void push(int node){
        stack1.push(node);
        if (stack2.isEmpty()){
            stack2.push(node);
        }else {
            if (stack2.peek()>node){
                stack2.push(node);
            }
        }
    }

    public static int min(){
        return stack2.peek();

    }


}
