/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n=nums.length;

        //双端队列,用来存索引
        Deque<Integer> deque=new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!deque.isEmpty()&&nums[i]>nums[deque.peekLast()]){
                deque.pollLast();
            }

            deque.offerLast(i);
        }

        int[] res=new int[n-k+1];
        res[0]=nums[deque.peekFirst()];

        for(int i=k;i<n;i++){
            while(!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]){
                deque.pollLast();

            }
            deque.offerLast(i);
            while(deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
            res[i-k+1]=nums[deque.peekFirst()];
        }

        return res;

    }
}
// @lc code=end

