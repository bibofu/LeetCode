/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    List<String> res=new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
        
        helper("",0,0,n);
        return res;

    }
    
    public void helper(String s,int left,int right,int n){

        if(left==n&&right==n){
            res.add(s);          
            return ;
        }
        
        if(left>n){
            return;
        }
        
        if(left<=right){
            helper(s+'(',left+1,right,n);
        }else{
            helper(s+'(',left+1,right,n);
            helper(s+')',left,right+1,n);
        }
    }
}
// @lc code=end

