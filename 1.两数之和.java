/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution { 
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int left=target-nums[i];
            if(map.containsKey(left)&&map.get(left)!=i){
                return new int[]{i,map.get(left)};
            }
        }

        return null;

    }
}
// @lc code=end

