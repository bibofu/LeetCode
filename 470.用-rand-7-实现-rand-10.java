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

        int x=(rand7()-1)*7+rand7();

        while(x>40){
            x=(rand7()-1)*7+rand7();
        }

        return x%10+1;
        
    }
}
//rand7     1 2 3 4 5 6 7
//rand7-1   0 1 2 3 4 5 6
//*7        0 7 14 21 28 35 42
//+rand7

// @lc code=end

