/*
 * @lc app=leetcode.cn id=518 lang=java
 *
 * [518] 零钱兑换 II
 */

// @lc code=start
class Solution {
    public int change(int amount, int[] coins) {

        int[] dp=new int[amount+1];
        dp[0]=1;
        
        for(int cion:coins){
            for(int i=cion;i<=amount;i++){

                dp[i]=dp[i]+dp[i-cion];

            }
        }

        return dp[amount];

    }
}
// @lc code=end

