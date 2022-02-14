/*
 * @lc app=leetcode.cn id=540 lang=java
 *
 * [540] 有序数组中的单一元素
 */

// @lc code=start
class Solution {
    public int singleNonDuplicate(int[] nums) {
        //方法一,逐项异或

        //方法二:
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(right-left)/2+left;
            if(nums[mid]==nums[mid^1]){
                left=mid+1;
            }else{
                right=mid;
            }
        }

        return nums[left];

    }
}
// @lc code=end

