/*
 * @lc app=leetcode.cn id=338 lang=java
 *
 * [338] 比特位计数
 */

// @lc code=start
class Solution {
    public int[] countBits(int n) {
        
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=1;
            }else if(i==2){
                dp[i]=1;
            }else{
                if(i%2==0){
                    dp[i]=dp[i/2];
                }else{
                    dp[i]=dp[i-1]+1;
                }
            }
        }
        
        return dp;
        
    }
}
// @lc code=end

