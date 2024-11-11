/*
 * @lc app=leetcode.cn id=1014 lang=java
 *
 * [1014] 最佳观光组合
 */

// @lc code=start
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans = 0;
        int max = values[0] + 0;
        for(int i=1;i<values.length;i++){
            ans = Math.max(ans,max+values[i]-i);
            max = Math.max(max,values[i]+i);
        }
        
        return ans;
    }
}
// @lc code=end

