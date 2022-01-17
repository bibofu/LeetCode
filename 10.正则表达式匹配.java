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
        
        
        int len1=s.length();
        int len2=p.length();
        
        boolean[][] dp=new boolean[len1+1][len2+1];
        dp[0][0]=true;
        
        //s为空，p不为空
        for(int i=2;i<=len2;i++){
            if(p.charAt(i-1)=='*'){
                dp[0][i]=dp[0][i-2];
            }
        }
        
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                char sc=s.charAt(i-1);
                char pc=p.charAt(j-1);
                if(sc==pc||pc=='.'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(pc=='*'){
                    if(dp[i][j-2]){
                        dp[i][j]=true;
                    }else if(sc==p.charAt(j-2)||p.charAt(j-2)=='.'){
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        
        return dp[len1][len2];
        
        
        

    }
}
// @lc code=end

