/*
 * @lc app=leetcode.cn id=221 lang=java
 *
 * [221] 最大正方形
 */

// @lc code=start
class Solution {
    
    public int maximalSquare(char[][] matrix) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        
        if(m==0||n==0){
            return 0;
        }
        int[][] dp=new int[m+1][n+1];
        
        
        int max=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(matrix[i-1][j-1]=='1'){
               
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                    if(dp[i][j]*dp[i][j]>max){
                        max=dp[i][j]*dp[i][j];
                    }
                }
                
            }
        }
        
        return max;
        
        
    }
    

}
// @lc code=end

