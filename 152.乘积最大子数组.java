/*
 * @lc app=leetcode.cn id=152 lang=java
 *
 * [152] 乘积最大子数组
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        
        int n=nums.length;
        
        //-1 2 3 -4 5 6
        int res=0;
        int[] max=new int[n+1];
        max[0]=1;
        int[] min=new int[n+1];
        min[0]=1;
        for(int i=0;i<n;i++){
            if(nums[i]<=0){
                max[i+1]=Math.max(min[i]*nums[i],nums[i]);
                min[i+1]=Math.min(max[i]*nums[i],nums[i]);
            }else{
                max[i+1]=Math.max(max[i]*nums[i],nums[i]);
                min[i+1]=Math.min(min[i]*nums[i],nums[i]);
            }
            
            if(max[i+1]>res){
                res=max[i+1];
            }
        }
        
        return res;

    }
}
// @lc code=end

