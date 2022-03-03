/*
 * @lc app=leetcode.cn id=131 lang=java
 *
 * [131] 分割回文串
 */

// @lc code=start
class Solution {
    
    List<List<String>> res=new ArrayList<>();
        
    public List<List<String>> partition(String s) {
        
        List<String> temp=new ArrayList<>();
        helper(s,0,temp);
        
        return res;

    }
    
    
    public void helper(String s,int start,List<String> temp){
        if(start==s.length()){
            res.add(new ArrayList<>(temp));
            return ;
        }
        
        for(int i=start+1;i<=s.length();i++){
            if(isValid(s.substring(start,i))){
                temp.add(s.substring(start,i));
                helper(s,i,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    
    
    public boolean isValid(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        
        return true;
    }
}
// @lc code=end

