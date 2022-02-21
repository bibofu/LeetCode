/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        
        int n=digits.length;
        int carry=0;
        for(int i=n-1;i>=0;i--){
            int temp=digits[i]+1;
            carry=temp/10;
            digits[i]=temp%10;
            if(carry==0){
                break;
            }
        }
        
        if(carry==1){
            int[] res=new int[n+1];
            res[0]=1;
            return res;
        }
        
        return digits;

    }
}
// @lc code=end

