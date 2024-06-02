/*
 * @lc app=leetcode.cn id=2928 lang=java
 *
 * [2928] 给小朋友们分糖果 I
 */

// @lc code=start
class Solution {
    public int distributeCandies(int n, int limit) {
        int res = 0;
        for(int i=0;i<=limit;i++){
            for(int j=0;j<=limit;j++){
                if(i+j>n){
                    break;
                }
                if(n-i-j<=limit){
                    res++;
                }
            }
        }

        return res;
    }
}
// @lc code=end

