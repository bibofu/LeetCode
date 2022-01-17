/*
 * @lc app=leetcode.cn id=342 lang=java
 *
 * [342] 4的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {

        while(n>=4&&n%4==0){
            n=n/4;
        }

        if(n!=1){
            return false;
        }

        return true;

    }
}
// @lc code=end

