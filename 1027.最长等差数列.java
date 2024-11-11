/*
 * @lc app=leetcode.cn id=1027 lang=java
 *
 * [1027] 最长等差数列
 */

// @lc code=start
class Solution {
    public boolean isBoomerang(int[][] points) {
        int x1=points[0][0];
        int y1=points[0][1];
        
        int x2=points[1][0];
        int y2=points[1][1];
        
        int x3=points[2][0];
        int y3=points[2][1];
        
        // 两点为同一点
        if(x1==x2&&y1==y2){
            return false;
        }
        
        if(x1==x3&&y1==y3){
            return false;
        }
        
        if(x2==x3&&y2==y3){
            return false;
        }
        
        if(x2==x1){
            if(x3==x1){
                return false;
            }else{
                return true;
            }
        }
        
        if(x3==x1){
            if(x2==x1){
                return false;
            }else{
                return true;
            }
        }
        
        
        float a = (float) (y2-y1)/(x2-x1);
        float b = (float) (y3-y1)/(x3-x1);
        
        if(a==b){
            return false;
        }
        
        return true;

    }
}
// @lc code=end

