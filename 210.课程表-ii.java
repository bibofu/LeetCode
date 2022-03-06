/*
 * @lc app=leetcode.cn id=210 lang=java
 *
 * [210] 课程表 II
 */

// @lc code=start
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int[] res=new int[numCourses];
        int index=0;
        
        
        
        int[] in=new int[numCourses];
        //每个课程的入度
        for(int[] num:prerequisites){
            in[num[0]]++;
        }
        
        Queue<Integer> queue=new LinkedList<>();
        //找到入度为0的课程
        for(int i=0;i<numCourses;i++){
            if(in[i]==0){
                res[index]=i;
                index++;
                
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
                    res[index]=pair[0];
                    index++;
                    queue.offer(pair[0]);
                }
            }
        }
        
        boolean flag=true;
        for(int i=0;i<numCourses;i++){
            if(in[i]>0){
                flag = false;
            }
        }
        
        return flag?res:new int[0];

    }
}
// @lc code=end

