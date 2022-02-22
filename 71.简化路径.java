/*
 * @lc app=leetcode.cn id=71 lang=java
 *
 * [71] 简化路径
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> stack=new Stack<>();
        
        String[] strs=path.split("/");
        
        for(String str:strs){
            str=str.trim();
            if(str.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    continue;
                }
            }else if(str.equals(".")||str.equals("")){
                continue;
            }else{
                stack.push(str);
            }
        }
        
        if(stack.isEmpty()){
            return "/";
        }
        
        String res="";
        
        while(!stack.isEmpty()){
            res="/"+stack.pop()+res;
        
        }
        
        return res;
    }
}
// @lc code=end

