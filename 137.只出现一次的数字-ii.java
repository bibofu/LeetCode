/*
 * @lc app=leetcode.cn id=137 lang=java
 *
 * [137] 只出现一次的数字 II
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {

        int[] count=new int[32];
        for(int num:nums){
            for(int i=0;i<32;i++){
                count[i]+=num&1;
                num>>>=1;
            }
        }
        int res=0;
        for(int i=0;i<32;i++){
            int temp=count[i]%3;
            res+=temp<<i;

        }
        return res;
    }
}
// @lc code=end

