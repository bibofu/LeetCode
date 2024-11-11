/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    // 如果不是快乐数，肯定会有循环
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1){
            int temp = helper(n);
            if(!set.add(temp)){
                return false;
            }
            n = temp;
        }

        return true;
    }

    public int helper(int n){
        int res = 0;
        while(n>0){
            int temp = n%10;
            res+= temp*temp;
            n=n/10;
        }
        return res;
    }
}
// @lc code=end

