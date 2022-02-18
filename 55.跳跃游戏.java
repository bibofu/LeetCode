/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {

        int lastReach=nums.length-1;
        int n=nums.length;

        for(int i=n-2;i>=0;i--){
            if(nums[i]+i>=lastReach){
                lastReach=i;
            }
        }

        return lastReach==0;

    }
}
// @lc code=end

