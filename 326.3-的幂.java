/*
 * @lc app=leetcode.cn id=326 lang=java
 *
 * [326] 3的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {

        while(n>=3&&n%3==0){
            n=n/3;
        }

        if(n!=1){
            return false;
        }

        return true;

    }
}
// @lc code=end

