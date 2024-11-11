/*
 * @lc app=leetcode.cn id=875 lang=java
 *
 * [875] 爱吃香蕉的珂珂
 */

// @lc code=start
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;
        for(int i:piles){
            if(i>max){
                max = i;
            }
        }
        int k = max;
        while(min < max){
            int speed = min +(max-min)/2;
            int time = get_time(piles,speed);
            if(time <= h){
                k = speed;
                max = speed;
            }else{
                min = speed+1;
            }
        }

        return k;
    }

    public int get_time(int[] piles,int speed){
        int res = 0;
        for(int i:piles){
            if(i%speed == 0){
                res+=i/speed;
            }else{
                res+=i/speed+1;
            }
        }
        return res;
    }
}
// @lc code=end

