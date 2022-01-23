/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int index=0;
        for(int num:nums){
            if(num==nums[index]){
                continue;
            }else{
                index++;
                nums[index]=num;
            }
        }
        
        return index+1;
        

    }
}
// @lc code=end

