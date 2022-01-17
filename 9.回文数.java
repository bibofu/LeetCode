/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        
        if(x==0){
            return true;
        }
    
        if(x<0){
            return false;
        }
        
        String str=String.valueOf(x);
        int left=0;
        int right=str.length()-1;
        
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;

    }
}
// @lc code=end

