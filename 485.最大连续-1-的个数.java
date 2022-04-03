/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续 1 的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max=0;
        int cnt=0;
        for(int i:nums){
            if(i==1){
                cnt++;
            }else{
                cnt=0;
            }
            
            if(cnt>max){
                max=cnt;
            }
        }
        
        return max;

    }
}
// @lc code=end

