/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        
        int index=0;
        for(int i:nums){
            if(i==0){
                continue;
            }else{
                nums[index]=i;
                index++;
            }
        }
        
        for(int i=index;i<nums.length;i++){
            nums[index]=0;
            index++;
        }

    }
}
// @lc code=end

