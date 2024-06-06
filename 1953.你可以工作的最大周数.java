/*
 * @lc app=leetcode.cn id=1953 lang=java
 *
 * [1953] 你可以工作的最大周数
 */

// @lc code=start
class Solution {
    public long numberOfWeeks(int[] milestones) {
        long max = 0;
        long sum = 0;
        for(int i:milestones){
            if(i>max){
                max = i;
            }
            sum+=i;
        }

        if(max<=sum/2){
            return sum;
        }else{
            return (sum-max)*2+1;
        }

    }
}
// @lc code=end

