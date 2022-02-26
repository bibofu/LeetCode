/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除有序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {

        int index=2;
        int n=nums.length;
        for(int i=2;i<n;i++){
            if(nums[i]!=nums[index-2]){
                nums[index]=nums[i];
            }
        }

        return index;

    }
}
// @lc code=end

