/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 */

// @lc code=start
class Solution {
    public int trailingZeroes(int n) {

        int zeroCount=0;

        for(int i=5;i<=n;i=i+5){

            int current=i;
            while(current%5==0){
                zeroCount++;
                current/=5;
            }
        }

        return zeroCount;

    }
}
// @lc code=end

