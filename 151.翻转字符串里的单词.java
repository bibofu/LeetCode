/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 翻转字符串里的单词
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        
        String[] strs=s.split(" ");
        
        String res="";
        for(String str:strs){
            if(!str.isEmpty()){
                res=" "+str+res;
            }
            
        }
        return res.trim();
    }
}
// @lc code=end

