/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()==0){
            return true;
        }
        
        
        int m=s.length();
        int n=t.length();
        
        boolean[][] dp=new boolean[m+1][n+1];
        
        dp[0][0]=true;
        for(int i=1;i<=n;i++){
            dp[0][i]=true;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                char ch1=s.charAt(i-1);
                char ch2=t.charAt(j-1);
                if(ch1==ch2){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=dp[i][j-1];
                }
            }
        }
        
        return dp[m][n];

    }
}
// @lc code=end

