/*
 * @lc app=leetcode.cn id=207 lang=java
 *
 * [207] 课程表
 */

// @lc code=start

//方法一，队列加数组模拟图
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        if(prerequisites.length==1){
            return true;
        }
        int[] in=new int[numCourses];
        //每个课程的入度
        for(int[] num:prerequisites){
            in[num[0]]++;
        }
        
        //queue用于存放入度为1的课程
        Queue<Integer> queue=new LinkedList<>();
        //找到入度为0的课程
        for(int i=0;i<numCourses;i++){
            if(in[i]==0){
                queue.offer(i);
            }
        }
        
        while(!queue.isEmpty()){
            int course=queue.poll();
            
            for(int[] pair:prerequisites){
                if(in[pair[0]]==0){
                    continue;
                }
                
                if(pair[1]==course){
                    in[pair[0]]--;
                }
                
                if(in[pair[0]]==0){
                    queue.offer(pair[0]);
                }
            }
        }
        
        for(int i=0;i<numCourses;i++){
            if(in[i]>0){
                return false;
            }
        }
        
        return true;
        
    }
}
// @lc code=end

