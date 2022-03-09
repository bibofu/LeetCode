/*
 * @lc app=leetcode.cn id=343 lang=java
 *
 * [343] 整数拆分
 */

// @lc code=start
class Solution {
    public int integerBreak(int n) {

        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i/2;j++){
                int temp=Math.max(dp[j],j)*Math.max(dp[i-j],i-j);
                dp[i]=Math.max(dp[i],temp);
            }
        }

        return max;

    }
}
// @lc code=end

