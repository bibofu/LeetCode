/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] res=new int[2];
        res[0]=findleft(nums,target);
        res[1]=findright(nums,target);
        
        return res;

    }
    
    public int findleft(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int res=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target<=nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
            
            if(nums[mid]==target){
                res=mid;
            }
            
        }
        
        return res;
    }
    
    public int findright(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int res=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target>=nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
            
            if(nums[mid]==target){
                res=mid;
            }
            
        }
        
        return res;
    }

}
// @lc code=end

