/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长递增子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {

        int[] dp=new int[nums.length];
        int max=1;
        dp[0]=1;

        for(int i=1;i<nums.length;i++){
            dp[i]=1;

            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]&&dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                }


            }
            if(dp[i]>max){
                max=dp[i];
            }

        }

        return max;

    }
}
// @lc code=end

