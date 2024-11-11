/*
 * @lc app=leetcode.cn id=442 lang=java
 *
 * [442] 数组中重复的数据
 */

// @lc code=start
class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> res=new ArrayList<>();
        if(nums.length==0){
            return res;
        }

        int[] freq=new int[nums.length+1];

        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]==1){
                res.add(nums[i]);
            }else{
                freq[nums[i]]++;
            }
        }

        return res;

    }
}
// @lc code=end

