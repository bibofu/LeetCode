/*
 * @lc app=leetcode.cn id=190 lang=java
 *
 * [190] 颠倒二进制位
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        if(n==0){
            return 0;
        }

        int res=0;

        for(int i=0;i<32;i++){
            res<<=1;
            if((n&1)==1){
                res=res+1;
            }
            n>>=1;
        }
        return res;
        
    }
}
// @lc code=end

