/*
 * @lc app=leetcode.cn id=347 lang=java
 *
 * [347] 前 K 个高频元素
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int[] res=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int temp=map.getOrDefault(nums[i],0);
            map.put(nums[i],temp+1);
        }
        
        PriorityQueue<Integer> queue=new PriorityQueue<>((o1,o2)->map.get(o1)-map.get(o2));
        
        for(int i:map.keySet()){
            if(queue.size()<k){
                queue.offer(i);
            }else{
                if(map.get(i)>map.get(queue.peek())){
                    queue.poll();
                    queue.offer(i);
                }
            }
        }
        
        int index=0;
        while(!queue.isEmpty()){
            res[index++]=queue.poll();
        }
        
        return res;
        

    }
}
// @lc code=end

