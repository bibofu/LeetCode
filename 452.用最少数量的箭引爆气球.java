/*
 * @lc app=leetcode.cn id=452 lang=java
 *
 * [452] 用最少数量的箭引爆气球
 */

// @lc code=start
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(Comparator.comparingInt(o -> o[1])));
        int i=0;
        int count = 0;
        while(i<points.length){
            count++;
            int j=i+1;
            while(j<points.length&&points[j][0]<=points[i][1]){
                j++;
            } 
            i=j;
        }

        return count;
    }
}
// @lc code=end

