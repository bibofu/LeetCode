/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {

        int time=0;
        int target=0;
        for(int i:nums){

            if(time==0){
                target=i;
                time++;
            }else{
                if(target==i){
                    time++;
                }else{
                    time--;
                }
            }

        }

        return target;

    }
}
// @lc code=end

