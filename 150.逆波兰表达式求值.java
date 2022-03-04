/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start
import java.utils;

class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack=new Stack<>();
        
        for(String s:tokens){
            if(s.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b/a);
            }else if(s.equals("*")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(a*b);
            }else if(s.equals("+")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(a+b);
            }else if(s.equals("-")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b-a);
            }else{
                stack.push(Integer.valueOf(s));
            }
        }
        
        return stack.peek();

    }
}
// @lc code=end

