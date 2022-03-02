/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        
        
        int minprice=prices[0];
        int max=0;
        
        int n=prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]<=minprice){
                minprice=prices[i];
            }else{
                maxprofile=Math.max(max,prices[i]-minprice);
            }
        }
        
        return max;

    }
}
// @lc code=end

