

/**
 * @author fubibo
 * @create 2021-02-23 23:43
 */

import java.util.Stack;

/**
 * 2个栈实现队列
 */
public class Q7 {
    Stack stack1=new Stack();
    Stack stack2=new Stack();
    public void push(int node){
        stack1.push(node);
    }

    public int pop() throws Exception{
        if (stack1.isEmpty()&&stack2.isEmpty()){
            throw new Exception("栈为空");


        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return (int) stack2.pop();
    }
}
