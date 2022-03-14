/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        
        int n=s.length();
        boolean[][] dp=new boolean[n][n];
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i-j<2){
                    dp[j][i]=s.charAt(j)==s.charAt(i);
                }else{
                    dp[j][i]=dp[j+1][i-1]&&(s.charAt(i)==s.charAt(j));
                }
                if(dp[j][i]){
                    res++;
                }
            }
        }
        
        return res;

    }
    
    
}
// @lc code=end

