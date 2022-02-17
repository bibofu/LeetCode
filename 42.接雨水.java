/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {

        Stack<Integer> stack=new Stack<>();

        int res=0;
        int n=height.length;

        // 单调栈的使用
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&height[i]>height[stack.peek()]){
                int top=stack.pop();
                if(stack.isEmpty()){
                    break;
                }
                int left=stack.peek();
                int h=Math.min(height[i],height[left])-height[top];
                int dist=i-left-1;
                res+=h*dist;
            }
            stack.push(i);
        }

        return res;

    }
}
// @lc code=end

