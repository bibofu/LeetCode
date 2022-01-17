/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int min_len=nums.length+1;
        int[] dp=new int[nums.length+1];
        dp[0]=0;

        for(int i=1;i<=nums.length;i++){
            dp[i]=dp[i-1]+nums[i-1];
            for(int j=0;j<i;j++){
                if(dp[i]-dp[j]>=target){
                    min_len=Math.min(i-j,min_len);
                }
            }
        }

        return min_len==nums.length+1?0:min_len;

    }
}
// @lc code=end

