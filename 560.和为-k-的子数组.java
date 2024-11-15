/*
 * @lc app=leetcode.cn id=560 lang=java
 *
 * [560] 和为 K 的子数组
 */

// @lc code=start
class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int pre = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            pre+=nums[i];
            if(map.containsKey(pre-k)){
                res += map.get(pre-k);
            }

            map.put(pre,map.getOrDefault(pre,0)+1);
        }

        return res;
    }
}
// @lc code=end

