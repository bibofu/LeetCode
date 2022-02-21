/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length==0){
            return 0;
        }
        
        int minprice=prices[0];
        int maxprofile=0;
        
        int n=prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]<=minprice){
                minprice=prices[i];
            }else{
                maxprofile=Math.max(maxprofile,prices[i]-minprice);
            }
        }
        
        return maxprofile;

    }
}
// @lc code=end

