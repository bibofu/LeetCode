/*
 * @lc app=leetcode.cn id=388 lang=java
 *
 * [388] 文件的最长绝对路径
 */

// @lc code=start
class Solution {
    public int lengthLongestPath(String input) {
        Stack<String> stack = new Stack<>();

        int res = 0;
        int cur_len = 0;
        String[] strs = input.split("\n");
        for(String s:strs){
            String[] paths = s.split("\t");
            while(stack.size() >= paths.length){
                cur_len -= stack.pop().length();
            }
            String path = paths[paths.length-1];
            stack.push(path+"/");
            cur_len += path.length()+1;
            if(path.indexOf(".") != -1){
                res = Math.max(res,cur_len-1);
            }
        }

        return res;
    }
}
// @lc code=end

