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

        int[] res=new int[2];

        for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
            if(map.containsKey(need)&&map.get(need)!=i){
                res[0]=i;
                res[1]=map.get(need);
                break;


            }
        }

        return res;

    }
}
// @lc code=end

