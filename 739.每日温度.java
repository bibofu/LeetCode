/*
 * @lc app=leetcode.cn id=739 lang=java
 *
 * [739] 每日温度
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(stack.isEmpty()){
                stack.push(i);
            }else if(temperatures[i] < temperatures[stack.peek()]){
                stack.push(i);
            }else{
                while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                    res[stack.peek()] = i-stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        }

        return res;
    }
}
// @lc code=end

