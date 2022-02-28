/*
 * @lc app=leetcode.cn id=96 lang=java
 *
 * [96] 不同的二叉搜索树
 */

// @lc code=start
class Solution {
    public int numTrees(int n) {
        
        if(n==1){
            return 1;
        }
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                int temp=dp[j-1]*dp[i-j];
                dp[i]+=temp;
            }
            
        }
        
        return dp[n];

    }
}

// @lc code=end

