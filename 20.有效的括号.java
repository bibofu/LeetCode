/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(')');
            }else if(s.charAt(i)=='{'){
                stack.push('}');
            }else if(s.charAt(i)=='['){
                stack.push(']');
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop()!=s.charAt(i)){
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}
// @lc code=end

