/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {

        if(x==0){
            return 0;
        }else if(x<4){
            return 1;
        }

        long res=0;

        for(long i=2;i<=x/2;i++){
            if((i*i<=x)&&((i+1)*(i+1)>x)){
                res=i;
                break;
                
            }
        }

        return (int)res;

    }
}
// @lc code=end

