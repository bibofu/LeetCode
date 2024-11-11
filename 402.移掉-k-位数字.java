/*
 * @lc app=leetcode.cn id=402 lang=java
 *
 * [402] 移掉 K 位数字
 */

// @lc code=start
class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(k >= n){
            return "0";
        }
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++){
            int cur = num.charAt(i)-'0';
            while(!stack.isEmpty() && stack.peek()>cur && k>0){
                stack.pop();
                k--;
            }
            stack.push(cur);
        }
        while(k > 0){
            stack.pop();
            k--;
        }

        String res = "";
        while(!stack.isEmpty()){
            res = String.valueOf(stack.pop()) + res;
        }
        boolean flag = false;
        int index = -1;
        //去掉前导0
        for(int i=0;i<res.length();i++){
            if(res.charAt(i) != '0'){
                flag = true;
                index = i;
                break;
            }
        }

        if(!flag){
            return "0";
        }

        return res.substring(index);
    }
}
// @lc code=end

