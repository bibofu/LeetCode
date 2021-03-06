/*
 * @lc app=leetcode.cn id=154 lang=java
 *
 * [154] 寻找旋转排序数组中的最小值 II
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        
        int left=0;
        int right=nums.length-1;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(nums[mid]>nums[right]){
                left=mid+1;
            }else if(nums[mid]>nums[right]){
                right=mid;
            }else{
                right=right-1;
            }
        
        }
        
        return nums[left];

    }
}
// @lc code=end

