/*
 * @lc app=leetcode.cn id=2938 lang=java
 *
 * [2938] 区分黑球与白球
 */

// @lc code=start
class Solution {
    public long minimumSteps(String s) {
        int sum = 0;
        long res = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                sum++;
            }else{
                res+=sum;
            }
        }

        return res;

    }
}
// @lc code=end

