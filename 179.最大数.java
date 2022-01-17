/*
 * @lc app=leetcode.cn id=179 lang=java
 *
 * [179] 最大数
 */

// @lc code=start
class Solution {
    public String largestNumber(int[] nums) {

        PriorityQueue<String> heap=new PriorityQueue<>((x,y)->(y+x).compareTo(x+y));
        for(int i:nums){
            heap.offer(String.valueOf(i));
        }

        String res="";
        while(heap.size()>0){
            res+=heap.poll();
        
        }

        if(res.charAt(0)=='0'){
            return "0";
        }

        return res;
        





    }
}
// @lc code=end

