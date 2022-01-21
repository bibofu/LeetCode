/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int diff=Integer.MAX_VALUE;
        
        int res=0;
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++){
            
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int temp=nums[i]+nums[left]+nums[right]-target;
                
                if(Math.abs(temp)<diff){
                    res=nums[i]+nums[left]+nums[right];
                    diff=Math.abs(temp);
                }
                if(temp==0){
                    return target;
                }else if(temp<0){
                    left++;
                }else{
                    right--;
                }
                
            }
           
        }
        
        return res;

    }
}
// @lc code=end

