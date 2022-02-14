/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {

        if(nums.length==0){
            return -1;
        }

        if(nums[0]==target){
            return 0;
        }

        int pivot=0;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                pivot=i;
                break;
            }
        }

        if(target<=nums[nums.length-1]){
            int left=pivot+1;
            int right=nums.length-1;
            while(left<=right){
                int mid=(left+right)/2;
                if(target==nums[mid]){
                    return mid;
                }else if(target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
        }else{
            int left2=0;
            int right2=pivot;
            while(left2<=right2){
                int mid2=(left2+right2)/2;
                if(target==nums[mid2]){
                    return mid2;
                }else if(target<nums[mid2]){
                    right2=mid2-1;
                }else{
                    left2=mid2+1;
                }

            }
        }

        return -1;

    }

}
// @lc code=end

