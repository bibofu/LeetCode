/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res=new ArrayList<>();

        int row1=0,row2=matrix.length-1;
        int col1=0,col2=matrix[0].length-1;

        while(row1<=row2&&col1<=col2){
            for(int i=col1;i<=col2;i++){
                res.add(matrix[row1][i]);
            }

            for(int i=row1+1;i<=row2;i++){
                res.add(matrix[i][col2]);
            }

            if(row1<row2&&col1<col2){
                for(int i=col2-1;i>=col1;i--){
                    res.add(matrix[row2][i]);
                }

                for(int i=row2-1;i>row1;i--){
                    res.add(matrix[i][col1]);
                }
            }

            row1++;
            col1++;
            row2--;
            col2--;
        }

        return res;

    }

   
}
// @lc code=end

