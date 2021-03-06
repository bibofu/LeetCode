/*
 * @lc app=leetcode.cn id=240 lang=java
 *
 * [240] 搜索二维矩阵 II
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length==0||matrix[0].length==0){
            return false;
        }

        int row=matrix.length;
        int col=matrix[0].length;

        int i=0;
        int j=col-1;
        while(i<row&&j>=0){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
                j--;
            }else{
                i++;
            }
        }

        return false;

        
    }
}
// @lc code=end

