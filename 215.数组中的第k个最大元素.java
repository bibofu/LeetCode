/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {

        Queue<Integer> queue=new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            if(i<k){
                queue.offer(nums[i]);
            }else{

                if(nums[i]>queue.peek()){
                    queue.poll();
                    queue.offer(nums[i]);
                }

            }
        }

        return queue.peek();

    }
}
// @lc code=end

