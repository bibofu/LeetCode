/*
 * @lc app=leetcode.cn id=918 lang=java
 *
 * [918] 环形子数组的最大和
 */

// @lc code=start
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       
        /** kadane算法 */
        if (nums == null || nums.length == 0){
            return 0;
        }
        int maxTillHere = nums[0];
        int maxInTotal = nums[0];

        int minTillHere = nums[0];
        int minInTotal = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            maxTillHere = Math.max(maxTillHere + nums[i], nums[i]);
            maxInTotal = Math.max(maxInTotal, maxTillHere);

            minTillHere = Math.min(minTillHere + nums[i], nums[i]);
            minInTotal = Math.min(minInTotal, minTillHere);
        }

        if (sum - minInTotal == 0){
            return maxInTotal;
        }
        return Math.max(sum-minInTotal,maxInTotal);
    }
}
// @lc code=end

