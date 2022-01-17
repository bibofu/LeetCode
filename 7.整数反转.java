/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
    
        if(x==Integer.MIN_VALUE){
            return 0;
        }
        
        int symbol=0;
        if(x>0){
            symbol=1;
        }else if(x<0){
            symbol=-1;
        }
        
        x=Math.abs(x);
        
        int cur=x;
        int temp=0;
        int res=0;
        while(cur>0){
            temp=cur%10;
            cur=cur/10;
            if(res>Integer.MAX_VALUE/10){
                return 0;
            }
            res=res*10+temp;
        }
        
        
        return res*symbol;
        
    }
}

// @lc code=end

