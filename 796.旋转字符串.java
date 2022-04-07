/*
 * @lc app=leetcode.cn id=796 lang=java
 *
 * [796] 旋转字符串
 */

// @lc code=start
class Solution {
    public boolean rotateString(String s, String goal) {
        
        int m=s.length();
        int n=goal.length();
        if(m!=n){
            return false;
        }
        
        if(s.equals(goal)){
            return true;
        }
        for(int i=1;i<m;i++){
            String s1=s.substring(0,i+1);
            String s2=goal.substring(n-i-1,n);
            if(s1.equals(s2)){
                if(s.substring(i+1,n).equals(goal.substring(0,n-i-1))){
                    return true;
                }
            }
        }
        
        return false;

    }
}
// @lc code=end

