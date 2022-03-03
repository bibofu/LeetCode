/*
 * @lc app=leetcode.cn id=128 lang=java
 *
 * [128] 最长连续序列
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }
        
        Arrays.sort(nums);
        
        int temp=1;
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                temp++;
            }else{
                max=Math.max(max,temp);
                temp=1;
            }
        }
        max=Math.max(max,temp);
        
        return max;

    }
}
// @lc code=end

