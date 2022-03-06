/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==1){
            return nums[0];
        }
        
        int[] num1=Arrays.copyOfRange(nums,0,nums.length-1);
        int[] num2=Arrays.copyOfRange(nums,1,nums.length);
        
        return Math.max(helper(num1),helper(num2));
        

    }
    
    public int helper(int[] nums){
        
        int n=nums.length;
        int[] dp=new int[n+1];
        if(nums.length==1){
            return nums[0];
        }
        dp[1]=nums[0];
        for(int i=2;i<=nums.length;i++){
            dp[i]=Math.max(dp[i-2]+nums[i-1],dp[i-1]);
        }
        
        return dp[n];
        
    }
}
// @lc code=end

