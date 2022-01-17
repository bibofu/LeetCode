/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
    
        int length=s.length();
        boolean[][] dp=new boolean[length][length];
        
        int max_len=0;
        int left_index=0;
       
       
        for(int i=0;i<length;i++){
            for(int j=0;j<=i;j++){
                if(i-j<2){
                    dp[j][i]=s.charAt(i)==s.charAt(j);
                }else{
                    dp[j][i]=dp[j+1][i-1]&&s.charAt(i)==s.charAt(j);
                }
                
                if(dp[j][i]&&i-j+1>max_len){
                    max_len=i-j+1;
                    left_index=j;
                }
            }
        }
        
        return s.substring(left_index,left_index+max_len);
        
        

    }
}
// @lc code=end

