/*
 * @lc app=leetcode.cn id=463 lang=java
 *
 * [463] 岛屿的周长
 */

// @lc code=start
class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int res=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    if(i==0&&j==0){
                        res+=4;
                    }else if(i==0&&j>0){
                        res+=4;
                        if(grid[i][j-1]==1){
                            res-=2;
                        }
                    }else if(i>0&&j==0){
                        res+=4;
                        if(grid[i-1][j]==1){
                            res-=2;
                        }
                    }else{
                        res+=4;
                        if(grid[i-1][j]==1){
                            res-=2;
                        }
                        if(grid[i][j-1]==1){
                            res-=2;
                        }
                    }
                }
            }
        }
        
        return res;

    }
}
// @lc code=end

