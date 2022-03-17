/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack=new Stack<>();
        
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                stack.push(')');
            }else if(c=='['){
                stack.push(']');
            }else if(c=='{'){
                stack.push('}');
            }else {
                if(!stack.isEmpty()&&stack.peek()==c){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();

    }
}
// @lc code=end

