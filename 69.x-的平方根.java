/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        
        long left=1;
        long right=x;
        while(left<right-1){
            long mid=left+(right-left)/2;
            if(mid*mid==x){
                return (int)mid;
            }else if(mid*mid<x){
                left=mid;
            }else{
                right=mid;
            }
        }
        
        if(right*right<=x){
            return (int)right;
        }else{
            return (int)left;
        }
        

    }
}
// @lc code=end

