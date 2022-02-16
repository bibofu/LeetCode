/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        
        String[] dp=new String[n];
        for(int i=0;i<n;i++){
            dp[i]="";
        }
        dp[0]="1";
        
        for(int i=1;i<n;i++){
            String s=dp[i-1];
            int length=s.length();
            char temp=s.charAt(0);
            int num=1;
            
            for(int j=1;j<length;j++){
                if(s.charAt(j)==temp){
                    num++;
                }else{
                    dp[i]+=num;
                    dp[i]+=temp;
                    num=1;
                    temp=s.charAt(j);
                }
            }
            
            dp[i]+=String.valueOf(num);
            dp[i]+=s.charAt(length-1);
            
        }
        
        
        return dp[n-1];

    }
}
// @lc code=end

