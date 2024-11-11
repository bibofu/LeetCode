/*
 * @lc app=leetcode.cn id=1004 lang=java
 *
 * [1004] 最大连续1的个数 III
 */

// @lc code=start
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        int pre_sum = 0;
        int res = 0;
        for(right=0;right<n;right++){
            pre_sum += (nums[right] == 0?1:0);
            if(pre_sum > k){
                while(left<right &&nums[left] ==1){
                    left++;
                }
                pre_sum -=1;
                left++;
            }

            if(right-left+1 > res){
                res = right-left+1;
            }
        }

        return res;

    }
}
// @lc code=end

