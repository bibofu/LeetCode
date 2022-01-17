/*
 * @lc app=leetcode.cn id=470 lang=java
 *
 * [470] 用 Rand7() 实现 Rand10()
 */

// @lc code=start
/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {

        int res=(rand7()-1)*7+rand7();
        while(res>40){
            res=(rand7()-1)*7+rand7();
        }

        return res%10+1;
        
    }
}
// @lc code=end

