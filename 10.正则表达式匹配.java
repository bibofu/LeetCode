/*
 * @lc app=leetcode.cn id=10 lang=java
 *
 * [10] 正则表达式匹配
 */

// @lc code=start
/**
 * 解法1 递归，效率低
 */
class Solution {
    public boolean isMatch(String s, String p) {
        
        
        if(p.length()==0){
            return s.length()==0;
        }
        
        boolean firstMatch= (s.length()>0)&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.');
        
        if(p.length()>=2&&p.charAt(1)=='*'){
            return isMatch(s,p.substring(2))||(firstMatch&&isMatch(s.substring(1),p));
        }else{
            return firstMatch&&isMatch(s.substring(1),p.substring(1));
        }
    
    }
}

/**
 * 解法二，动态规划
 */
class Solution {
    public boolean isMatch(String s, String p) {
        
        int m=s.length();
        int n=p.length();
        
        boolean[][] dp=new boolean[m+1][n+1];
        dp[0][0]=true;
        
        for(int i=2;i<=n;i++){
            if(p.charAt(i-1)=='*'){
                dp[0][i]=dp[0][i-2];
            }
        }
        
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                char c1=s.charAt(i-1);
                char c2=p.charAt(j-1);
                if(c1==c2){
                    dp[i][j]=dp[i-1][j-1];
                }else if(c2=='.'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(c2=='*'){
                    if(dp[i][j-2]){
                        dp[i][j]=true;
                    }else if(p.charAt(j-2)==c1||p.charAt(j-2)=='.'){
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        
        return dp[m][n];

    }
}
// @lc code=end

