/*
 * @lc app=leetcode.cn id=81 lang=java
 *
 * [81] 搜索旋转排序数组 II
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return true;
            
            if (nums[left] < nums[mid] || nums[mid] > nums[right]) {
                if (target > nums[mid] || target < nums[left]) {
                   left = mid + 1; 
                } else {
                   right = mid - 1;
                }
            } else if (nums[mid] < nums[right] || nums[left] > nums[mid]) {
                if (target < nums[mid] || target > nums[right]) {
                    right = mid - 1;
                }  else {
                    left = mid + 1;
                }
            } else {
                right--;
            }
        }

        return false;
    }
}
// @lc code=end

