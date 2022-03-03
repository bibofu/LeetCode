/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    // index [0]  [1]  [2]  [3]  [4]
    // gas    1    2    3    4    5
    // cost   3    4    5    1    2
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        //gas总和大于等于cost总和,肯定能走完一圈
        if(sum(gas)<sum(cost)){
            return -1;
        }
         
        int cnt=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            cnt+=gas[i]-cost[i];
            if(cnt<0){
                cnt=0;
                start=i+1;
            }
        }
        
        return start;
    }
    
    public int sum(int[] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res+=arr[i];
        }
        
        return res;
    }
}
// @lc code=end

