/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {

        int[] dp=new int[nums.length+1];

        dp[1]=nums[0];
        int max=dp[1];
        for(int i=2;i<=nums.length;i++){
            dp[i]=Math.max(dp[i-1]+nums[i-1],nums[i-1]);
            if(dp[i]>max){
                max=dp[i];
            }
        }

        return max;


    }
}
// @lc code=end

