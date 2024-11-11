/*
 * @lc app=leetcode.cn id=525 lang=java
 *
 * [525] 连续数组
 */

// @lc code=start
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                sum+=1;
            }else{
                sum+=-1;
            }
            if(sum == 0){
                res = Math.max(res,i+1);
            }

            if(map.containsKey(sum)){
                res = Math.max(res,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }

        return res;
        
    }
}
// @lc code=end

