/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {

        int left=0;
        int right=0;
        int res=0;

        int n=nums.length;
        while(right<n-1){
            int farthest=0;
            for(int i=left;i<right+1;i++){
                farthest=Math.max(farthest,nums[i]+i);
            }
            left=right+1;
            right=farthest;

            res++;
        }

        return res;

    }
}
// @lc code=end

