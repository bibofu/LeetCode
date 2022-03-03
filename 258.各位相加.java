/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        
        if(num<10){
            return num;
        }
        while(num>=10){
            num=helper(num);
        }
        
        return num;
    }
    
    public int helper(int n){
        int res=0;
        while(n>0){
            res+=n%10;
            n=n/10;
        }
        
        return res;
    }
}
// @lc code=end

