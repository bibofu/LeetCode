/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length<=1){
            return intervals;
        }
        
        Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
        
        List<int[]> res=new ArrayList<>();
        
        //intervals = [[1,3],[2,6],[8,10],[15,18]]
        int[] current=intervals[0];
        res.add(current);
        
        for(int[] interval:intervals){
            int curbegin=current[0];
            int curend=current[1];
            int nextbegin=interval[0];
            int nextend=interval[1];
            if(curend>=nextbegin){
                current[1]=Math.max(curend,nextend);
            }else{
                current=interval;
                res.add(interval);
            }
        }
        
        return res.toArray(new int[res.size()][]);
        
        

    }
}
// @lc code=end

