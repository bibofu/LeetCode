/*
 * @lc app=leetcode.cn id=91 lang=java
 *
 * [91] 解码方法
 */

// @lc code=start
class Solution {
    public int numDecodings(String s) {
        
        int n=s.length();
        if(s.charAt(0)=='0'){
            return 0;
        }
        int[] dp=new int[n+1];
        
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int a=s.charAt(i-2)-'0';
            int b=s.charAt(i-1)-'0';
            if(b==0){
                if(a==0){
                    return 0;
                }else if((10*a+b>26)){
                    dp[i]=0;
                }else{
                    dp[i]=dp[i-2];
                }
            }else{
                 if((10*a+b<=26)&&(10*a+b)>=10){
                    dp[i]=dp[i-1]+dp[i-2];
                 }else{
                    dp[i]=dp[i-1];
                 }
            }
            
           
        }
        
        return dp[n];

    }
}
// @lc code=end

