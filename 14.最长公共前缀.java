/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs==null||strs.length==0){
            return "";
        }

        if(strs.length==1){
            return strs[0];
        }
        
        String res=strs[0];
        for(int i=1;i<strs.length;i++){
            res=getTwoCommon(res,strs[i]);
        }
        
        return res;

    }
    
    public String getTwoCommon(String s1,String s2){
        
        int len=Math.min(s1.length(),s2.length());
        String temp="";
        for(int i=0;i<len;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                temp+=s1.charAt(i);
            }else{
                return temp;
            }
        }
        
        return temp;
    }
}
// @lc code=end

