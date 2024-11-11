/*
 * @lc app=leetcode.cn id=503 lang=java
 *
 * [503] 下一个更大元素 II
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int index = 0;
        for(int i=0;i<n;i++){
            res[i] = search_bigger(i,nums);
        }

        return res;

    }

    public int search_bigger(int index,int[] nums){
        int n = nums.length;
        for(int i=index+1;i<n;i++){
            if(nums[i] > nums[index]){
                return nums[i];
            }
        }
        for(int i=0;i<index;i++){
            if(nums[i] > nums[index]){
                return nums[i];
            }
        }

        return -1;
    }
}
// @lc code=end

