/*
 * @lc app=leetcode.cn id=29 lang=java
 *
 * [29] 两数相除
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {

        if(dividend==Integer.MIN_VALUE&&divisor==-1){
            return Integer.MAX_VALUE;
        }

        boolean flag=(dividend>0&&divisor<0)||(dividend<0&&divisor>0);

        int res=0;

        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);

        int shift=31;
        while(a>=b){
            while(a<b<<shift){
                shift--;
            }

            a-=b<<shift;
            res+=1<<shift;
       }

        return flag?-res:res;

    }


}
// @lc code=end

