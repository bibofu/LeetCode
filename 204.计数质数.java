/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        int cnt = 0;
        boolean[] not_prime = new boolean[n];

        for(int i=2;i<n;i++){
            //如果i是质数
            if(not_prime[i] == false){
                cnt++;
                for(int j=2;i*j<n;j++){
                    not_prime[i*j] = true;
                }
            }
        }

        return cnt;
    }
}
// @lc code=end

