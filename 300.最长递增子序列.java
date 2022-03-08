/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长递增子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {

        int n=nums.length;
        int[] dp=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            int temp=1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    temp=Math.max(temp,dp[j]+1);
                }
            }
            dp[i]=temp;
            if(dp[i]>max){
                max=dp[i];
            }
        }

        return max;

    }
}
// @lc code=end

