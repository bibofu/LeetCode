/*
 * @lc app=leetcode.cn id=1380 lang=java
 *
 * [1380] 矩阵中的幸运数
 */

// @lc code=start
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        List<Integer> res=new ArrayList<>();
        
        int row=matrix.length;
        int col=matrix[0].length;
        
        for(int i=0;i<row;i++){
            
            int j;
            int jmin=0;//每行最小数字的列index
            int min=Integer.MAX_VALUE;
            for(j=0;j<col;j++){
                
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    jmin=j;
                }
            }
            
            for(int k=0;k<row;k++){
                if(matrix[k][jmin]>matrix[i][jmin]){
                    break;
                }
                if(k==row-1){
                    res.add(matrix[i][jmin]);
                }
            }
        }
        
        return res;

    }
}
// @lc code=end

