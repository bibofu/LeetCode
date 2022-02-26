/*
 * @lc app=leetcode.cn id=2016 lang=java
 *
 * [2016] 增量元素之间的最大差值
 */

// @lc code=start
class Solution {
    public int maximumDifference(int[] nums) {
        
        int res=-1;
        int min=nums[0];
        
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<=min){
                min=nums[i];
            }else{
                res=Math.max(res,nums[i]-min);
            }
        }
        
        return res;

    }
}
// @lc code=end

