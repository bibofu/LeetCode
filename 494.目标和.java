/*
 * @lc app=leetcode.cn id=494 lang=java
 *
 * [494] 目标和
 */

// @lc code=start
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }
        int diff = sum - target;
        if(diff < 0 || diff%2!=0){
            return 0;
        }
        int n = diff/2;
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i:nums){
            for(int j=n;j>=i;j--){
                dp[j] = dp[j] + dp[j-i];
            }
        }

        return dp[n];
    }

    
}
// @lc code=end

