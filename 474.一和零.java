/*
 * @lc app=leetcode.cn id=474 lang=java
 *
 * [474] 一和零
 */

// @lc code=start
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];

        for(String s:strs){
            int zero_cnt = 0;
            int one_cnt = 0;
            for(char c:s.toCharArray()){
                if(c == '0'){
                    zero_cnt++;
                }else{
                    one_cnt++;
                }
            }

            for(int i=m;i>=zero_cnt;i--){
                for(int j=n;j>=one_cnt;j--){
                    dp[i][j] = Math.max(dp[i][j],dp[i-zero_cnt][j-one_cnt] + 1);
                }
            }

        }

        return dp[m][n];
    }
}
// @lc code=end

