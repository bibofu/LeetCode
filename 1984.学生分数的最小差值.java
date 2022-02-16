/*
 * @lc app=leetcode.cn id=1984 lang=java
 *
 * [1984] 学生分数的最小差值
 */

// @lc code=start
class Solution {
    public int minimumDifference(int[] nums, int k) {

        if(k==1){
            return 0;
        }

        Arrays.sort(nums);
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n-k+1;i++){
            int temp=nums[i+k-1];
            if(temp-nums[i]<res){
                res=temp-nums[i];
            }

        }

        return res;

    }
}
// @lc code=end

