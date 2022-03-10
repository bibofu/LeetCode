/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow=0;
        int fast=0;
        while(true){
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow==fast){
                break;
            }
        }
        
        slow=0;
        while(true){
            slow=nums[slow];
            fast=nums[fast];
            if(slow==fast){
                break;
            }
        }
        
        return slow;
        

    }
}


// @lc code=end

