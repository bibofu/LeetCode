/*
 * @lc app=leetcode.cn id=123 lang=java
 *
 * [123] 买卖股票的最佳时机 III
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int firstbuy=Integer.MIN_VALUE;
        int secondbuy=Integer.MIN_VALUE;
        int firstsell=0;
        int secondsell=0;
        for(int i=0;i<prices.length;i++){
            firstbuy=Math.max(firstbuy,-prices[i]);
            firstsell=Math.max(firstsell,firstbuy+prices[i]);
            secondbuy=Math.max(secondbuy,firstsell-prices[i]);
            secondsell=Math.max(secondsell,secondbuy+prices[i]);
        }

        return secondsell;
    }
}
// @lc code=end

