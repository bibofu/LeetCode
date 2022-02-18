/*
 * @lc app=leetcode.cn id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start

//https://www.youtube.com/watch?v=g9YQyYi4IQQ

class Solution {
    public double myPow(double x, int n) {

        if(n>=0){
            return helper(x,n);
        }else{
            return 1/helper(x,Math.abs(n));
        }

    }

    public double helper(double x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        double res=helper(x,n/2);
        if(n%2==0){
            return res*res;
        }else{
            return res*res*x;
        }

    }
}
// @lc code=end

