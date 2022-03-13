/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        
        int sum=0;
        int m=s.length();
        int n=t.length();
        for(int i=0;i<n;i++){
            sum+=t.charAt(i)-'0';
        }
        
        for(int j=0;j<m;j++){
            sum-=s.charAt(j)-'0';
        }
        
        return (char)(sum+'0');

    }
}
// @lc code=end

