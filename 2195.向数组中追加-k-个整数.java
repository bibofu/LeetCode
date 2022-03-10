/*
 * @lc app=leetcode.cn id=2195 lang=java
 *
 * [2195] 向数组中追加 K 个整数
 */

// @lc code=start
class Solution {
    public long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        long sum = 0;

        for (int num: nums) {
            if (!set.contains(num) && num <= k) {
                k++;
                sum += num;        
            }            
            set.add(num);
        }

        long res = (long)(1 + k) * k / 2 - sum;
        return res;        

    }
}
// @lc code=end

