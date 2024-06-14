/*
 * @lc app=leetcode.cn id=2806 lang=java
 *
 * [2806] 取整购买后的账户余额
 */

// @lc code=start
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {

        //80 20
        //19 80 ===> 100 - 19 - (10-9)
        if(purchaseAmount%10 == 0){
            return 100 - purchaseAmount;
        }else if(purchaseAmount%10 >= 5){
            return 90 - purchaseAmount + purchaseAmount%10;
        }else{
            return 100 - purchaseAmount + purchaseAmount%10;
        }

    }
}
// @lc code=end

