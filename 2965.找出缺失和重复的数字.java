/*
 * @lc app=leetcode.cn id=2965 lang=java
 *
 * [2965] 找出缺失和重复的数字
 */

// @lc code=start
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int repeat = 0;
        int lost = 0;
        int[] freq = new int[n*n+1];
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                if(freq[grid[i][j]] == 0){
                    freq[grid[i][j]] = 1;
                }else{
                    repeat = grid[i][j];
                }
            }
        }

        for(int i =1;i<n*n+1;i++){
            if(freq[i] == 0){
                lost = i;
            }
        }

        return new int[]{repeat,lost};
    }
}
// @lc code=end

