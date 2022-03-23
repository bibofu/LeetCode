/*
 * @lc app=leetcode.cn id=32 lang=java
 *
 * [32] 最长有效括号
 */

// @lc code=start
class Solution {
    public int longestValidParentheses(String s) {

        if(s==null||s.length()<2){
            return 0;
        }

        int n=s.length();
        int max=0;
        int[] dp=new int[n];

        for(int i=1;i<n;i++){
            if(s.charAt(i)==')'){
                int preLen=dp[i-1];
                int pre=i-preLen-1;
                if(pre>=0&&s.charAt(pre)=='('){
                    dp[i]=dp[i-1]+2;

                    if(pre-1>=0){
                        dp[i]+=dp[pre-1];
                    }
                }

                
            }

            max=Math.max(max,dp[i]);

        }

        return max;

    }
}
// @lc code=end

