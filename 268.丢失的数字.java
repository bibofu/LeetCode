/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 丢失的数字
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int sum=(1+n)*n/2;
        for(int i:nums){
            sum-=i;
        }
        return sum;

    }
}
// @lc code=end

