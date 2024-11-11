/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals ==null||intervals.length <=1){
            return intervals;
        }
        Arrays.sort(intervals,(o1,o2)->o1[0]-o2[0]);
        List<int[]> res = new ArrayList<>();
        int[] cur = intervals[0];

        for(int i=1;i<intervals.length;i++){
            int[] nums = intervals[i];
            if(nums[0] > cur[1]){
                res.add(cur);
                cur = nums;
            }else{
                cur[1] = Math.max(cur[1],nums[1]);
            }
        }
        res.add(cur);

        return res.toArray(new int[res.size()][2]);

    }
}
// @lc code=end

