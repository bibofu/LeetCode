/*
 * @lc app=leetcode.cn id=72 lang=java
 *
 * [72] 编辑距离
 */

// @lc code=start
class Solution {
    public int minDistance(String word1, String word2) {
        
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            dp[i][0]=i;
        }
        for(int i=1;i<=n;i++){
            dp[0][i]=i;
        }
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                //可能插入，删除，替换
                char c1=word1.charAt(i-1);
                char c2=word2.charAt(j-1);
                if(c1==c2){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    int update=dp[i-1][j-1]+1;
                    int insert=Math.min(dp[i-1][j],dp[i][j-1])+1;
                    int delete=Math.min(dp[i-1][j],dp[i][j-1])+1;
                    
                    dp[i][j]=Math.min(update,insert);
                }
                
            }
        }
        
        return dp[m][n];

    }
}
// @lc code=end

