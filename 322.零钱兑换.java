/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<=amount;i++){

            for(int coin:coins){
                int left=i-coin;
                if(left<0||dp[left]==amount+1){
                    continue;
                }
                dp[i]=Math.min(dp[i],dp[left]+1);
            }
        }

        return dp[amount]==amount+1?-1:dp[amount];
    }
}
// @lc code=end

