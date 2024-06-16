/*
 * @lc app=leetcode.cn id=2779 lang=java
 *
 * [2779] 数组的最大美丽值
 */

// @lc code=start
class Solution {
    /**
     * 第一种解法
     * 1. 对数组排序
     * 2. 双指针，找到2k范围内最多存在多少个元素
     */
    public int maximumBeauty(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int res = 0;
        Arrays.sort(nums);
        while(left<=right && right < n){
            if(nums[right] - nums[left] > 2*k){
                left++;
            }
            res = Math.max(res,right - left +1);

            right++;

        }

        return res;
    }
}
// @lc code=end

