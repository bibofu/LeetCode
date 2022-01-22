/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack=new Stack<>();
        
        int length=s.length();
        for(int i=0;i<length;i++){
            if(s.charAt(i)=='('){
                stack.push(')');
            }else if(s.charAt(i)=='{'){
                stack.push('}');
            }else if(s.charAt(i)=='['){
                stack.push(']');
            }else{
                if(stack.empty()||stack.pop()!=s.charAt(i)){
                    return false;
                }
            }
        }
        
        return stack.size()==0;

    }
}
// @lc code=end

