/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left=0;
        int right=0;
        int min=Integer.MAX_VALUE;
        int temp=nums[0];
        while(left<=right&&right<nums.length){
            if(temp>=target){
                min=Math.min(min,right-left+1);
                if(left==right){
                    right++;
                }else{
                    temp=temp-nums[left];
                    left++;
                }
            }else{
                right++;
                if(right<nums.length){
                    temp+=nums[right];
                }
               
            }
        }
        
        return min==Integer.MAX_VALUE?0:min;

    }
}
// @lc code=end

