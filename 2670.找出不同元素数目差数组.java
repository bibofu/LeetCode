/*
 * @lc app=leetcode.cn id=2670 lang=java
 *
 * [2670] 找出不同元素数目差数组
 */

// @lc code=start
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0;i<n;i++){
            res[i] = get_number(0,i,nums) - get_number(i+1,n-1,nums);
        }

        return res;
    }

    public int get_number(int a,int b,int[] nums){
        if(a>=nums.length){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = a;i<=b;i++){
            set.add(nums[i]);
        }

        return set.size();
    }
}
// @lc code=end

