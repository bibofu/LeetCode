/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    
    List<String> res= new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
        
        helper(n,0,0,"");
        return res;

    }
    
    public void helper(int n,int left,int right,String temp){
        if(left==n&&right==n){
            res.add(new String(temp));
            return ;
        }
        
        if(left>n||left<right){
            return ;
        }
        
        helper(n,left+1,right,temp+'(');
        helper(n,left,right+1,temp+')');
        
        
    }
}
// @lc code=end

