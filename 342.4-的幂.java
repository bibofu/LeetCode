/*
 * @lc app=leetcode.cn id=342 lang=java
 *
 * [342] 4的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {
    
        return n>0&&(n&(n-1))==0&&n%3==1;

    }
}
// @lc code=end

