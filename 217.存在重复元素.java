/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        
        return false;

    }
}
// @lc code=end

