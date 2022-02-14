/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first=findFirst(nums,target);
        int last=findLast(nums,target);

        return new int[]{first,last};



    }

    public int findFirst(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int index=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            //尽量往左走
            if(target<=nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }

            if(nums[mid]==target){
                index=mid;
            }
        }

        return index;
    }

    public int findLast(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int index=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            //尽量往右走
            if(target>=nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }

            if(nums[mid]==target){
                index=mid;
            }
        }

        return index;
    }
}
// @lc code=end

