/*
 * @lc app=leetcode.cn id=264 lang=java
 *
 * [264] 丑数 II
 */

// @lc code=start
class Solution {
    public int nthUglyNumber(int n) {
        
        int[] dp=new int[n];
        dp[0]=1;
        int index2=0;
        int index3=0;
        int index5=0;
        for(int i=1;i<n;i++){
            dp[i]=Math.min(2*dp[index2],Math.min(3*dp[index3],5*dp[index5]));
            if(dp[i]==2*dp[index2]){
                index2++;
            }
            if(dp[i]==3*dp[index3]){
                index3++;
            }
            if(dp[i]==5*dp[index5]){
                index5++;
            }
        }
        
        return dp[n-1];

    }
}
// @lc code=end

