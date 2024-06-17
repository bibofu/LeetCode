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

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        // 121
        // 1 -> 12
        // 12 -> 1
        // 121 -> 0
        int ori = x;
        int reverse = 0;
        while(x>0){
            reverse = reverse*10+ x%10;
            x=x/10;
        }

        return reverse == ori;
    }
}
// @lc code=end

