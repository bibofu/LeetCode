/*
 * @lc app=leetcode.cn id=84 lang=java
 *
 * [84] 柱状图中最大的矩形
 */

// @lc code=start
class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==1){
            return heights[0];
        }

        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(0);
        int max=0;

        int n=heights.length;
        for(int i=1;i<n;i++){
            int cur=heights[i];
            if(cur>=heights[stack.peek()]){
                stack.push(i);
            }else{
                while(!stack.isEmpty()&&cur<heights[stack.peek()]){
                    int temp=heights[stack.pop()];
                    if(stack.isEmpty()){
                        max=Math.max(max,temp*i);
                    }else{
                        max=Math.max(max,temp*(i-stack.peek()-1));
                    }
                }
                stack.push(i);
            }
        }

        if(!stack.isEmpty()){
            int i=heights.length;
            while(!stack.isEmpty()){
                int temp=heights[stack.pop()];
                if(stack.isEmpty()){
                    max=Math.max(max,temp*i);
                }else{
                    max=Math.max(max,temp*(i-stack.peek()-1));
                }
            }
        }

        return max;

    }
}
// @lc code=end

