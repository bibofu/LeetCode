/*
 * @lc app=leetcode.cn id=2104 lang=java
 *
 * [2104] 子数组范围和
 */

// @lc code=start
class Solution {
    public long subArrayRanges(int[] nums) {
        
        long res=0;
        for(int i=0;i<nums.length;i++){
            long max=nums[i];
            long min=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>=max){
                    max=nums[j];
                }else if(nums[j]<=min){
                    min=nums[j];
                }
                res+=max-min;
            }
        }
        
        return res;

    }
}
// @lc code=end

