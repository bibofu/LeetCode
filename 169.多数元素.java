/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        
        int temp=nums[0];
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==temp){
                cnt++;
            }else{
                cnt--;
            }
            
            if(cnt==0){
                temp=nums[i];
                cnt=1;
            }
        }
        
        return temp;

    }
}


// @lc code=end

