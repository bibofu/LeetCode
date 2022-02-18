/*
 * @lc app=leetcode.cn id=44 lang=java
 *
 * [44] 通配符匹配
 */

// @lc code=start
class Solution {
    public boolean isMatch(String s, String p) {

        int m=s.length();
        int n=p.length();

        boolean[][] dp=new boolean[m+1][n+1];
        dp[0][0]=true;

        for(int i=1;i<=n;i++){
            if(p.charAt(i-1)!='*'){
                break;
            }
            dp[0][i]=true;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                char c1=s.charAt(i-1);
                char c2=p.charAt(j-1);
                if(c1==c2||c2=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(c2=='*'){
                    dp[i][j]=dp[i-1][j]|dp[i][j-1]|dp[i-1][j-1];                
                }
            }
        }

        return dp[m][n];

    }
}
// @lc code=end

