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
        int res=0;

        int length=s.length();
        int[] dp=new int[length];// dp[i]：严格以i位置结尾，形成的有效括号子串最长长度是多少

        for(int i=1;i<length;i++){
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
            res=Math.max(res,dp[i]);

        }

        return res;

    }
}
// @lc code=end

