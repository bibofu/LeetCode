/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {

        if(nums.length==1){
            return true;
        }

        int maxjump=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxjump){
                return false;

            }

            maxjump=Math.max(maxjump,i+nums[i]);
        }

        return maxjump>=nums.length-1;

    }
}
// @lc code=end

