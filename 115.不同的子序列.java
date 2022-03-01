/*
 * @lc app=leetcode.cn id=115 lang=java
 *
 * [115] 不同的子序列
 */

// @lc code=start
class Solution {
    public int numDistinct(String s, String t) {
        
        int m=s.length();
        int n=t.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0]=1;
        }
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                char ch1=s.charAt(i-1);
                char ch2=t.charAt(j-1);
                if(ch1==ch2){
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[m][n];
    }
}
// @lc code=end

