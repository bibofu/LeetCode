/*
 * @lc app=leetcode.cn id=309 lang=java
 *
 * [309] 最佳买卖股票时机含冷冻期
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length==1){
            return 0;
        }
        //买入股票花钱，买进股票赚钱
        //dp[i][0] 第i天持有股票对应的收益
        //dp[i][1] 第i天不持有股票，卖出股票，下一天为冷却期对应的收益
        //dp[i][2] 第i天不持有股票，也不卖出对应的收益
        int n=prices.length;
        int[][] dp=new int[n][3];
        dp[0][0]=-prices[0];
        dp[0][1]=0;
        dp[0][2]=0;

        for(int i=1;i<n;i++){
            //第i天持有股票，可能 1)第i-1天就持有 2）第i-1天不持有，也没有卖出
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][2]-prices[i]);

            //第i天卖出股票，第i-1天肯定持有
            dp[i][1]=dp[i-1][0]+prices[i];

            //可能 1)第i-1天持有股票，卖出 2)第i-1天也不持有股票
            dp[i][2]=Math.max(dp[i-1][1],dp[i-1][2]);
        }

        return Math.max(dp[n-1][1],dp[n-1][2]);


    }
}
// @lc code=end

