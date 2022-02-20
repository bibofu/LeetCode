/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        
        int r1=0;
        int r2=n-1;
        int c1=0;
        int c2=n-1;
        
        int temp=1;
        while(r1<=r2&&c1<=c2){
            //左到右
            for(int i=c1;i<=c2;i++){
                res[r1][i]=temp;
                temp++;
            }
            
            //上到下
            for(int i=r1+1;i<=r2;i++){
                res[i][c2]=temp;
                temp++;
            }
            
            for(int i=c2-1;i>=c1;i--){
                res[r2][i]=temp;
                temp++;
            }
            
            for(int i=r2-1;i>r1;i--){
                res[i][c1]=temp;
                temp++;
            }
            
            r1++;
            c1++;
            c2--;
            r2--;
        }
        
        return res;

    }
}
// @lc code=end

