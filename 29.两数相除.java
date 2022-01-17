/*
 * @lc app=leetcode.cn id=29 lang=java
 *
 * [29] 两数相除
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {

        if(Math.abs(dividend)<Math.abs(divisor)){
            return 0;
        }

        int flag=1;
        if(dividend*divisor<0){
            dividend=Math.abs(dividend);
            divisor=Math.abs(divisor);
            flag=-1;


        }

        int one=divisor;

        int num=1;
        while(divisor<dividend){
            divisor=divisor+one;
            if(divisor>dividend){
                break;
            }

            num++;
        }

        return num*flag;



    }


}
// @lc code=end

