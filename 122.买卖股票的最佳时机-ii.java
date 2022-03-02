/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        
        int minprice=prices[0];
        int res=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }else{
               res+=prices[i]-minprice;
               minprice=prices[i];
            }
        }
        
        return res;

    }
}
// @lc code=end

