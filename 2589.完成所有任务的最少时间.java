/*
 * @lc app=leetcode.cn id=2589 lang=java
 *
 * [2589] 完成所有任务的最少时间
 */

// @lc code=start
class Solution {
    public int findMinimumTime(int[][] tasks) {
        /* 数组按照右端排序 */
        Arrays.sort(tasks,new Comparator<int[]>() {
            @Override
            public int compare(int[] o1,int[] o2){
                return o1[o1.length-2]-o2[o2.length-2];
            }
        });

        int[] time = new int[2005];
        for(int i=0;i<tasks.length;i++){
            int start = tasks[i][0],end = tasks[i][1],duration = tasks[i][2];
            int overlap = 0;
            for(int t=start;t<=end;t++){
                if(time[t] == 1){
                    overlap++;
                }
            }

            if(overlap>=duration){
                continue;
            }
            int diff = duration-overlap;
            for(int t =end;t>=start;t--){
                if(time[t] == 0){
                    time[t]=1;
                    diff--;
                }

                if(diff==0){
                    break;
                }
            }
        }

        int res=0;
        for(int t=0;t<=2000;t++){
            if(time[t]==1){
                res++;
            }
        }

        return res;
    }
}
// @lc code=end

