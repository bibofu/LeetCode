/*
 * @lc app=leetcode.cn id=744 lang=java
 *
 * [744] 寻找比目标字母大的最小字母
 */

// @lc code=start
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int min=Integer.MAX_VALUE;
        char res=letters[0];
        for(char c:letters){
            if(c-target>0){
                if(c-target<min){
                    min=c-target;
                    res=c;
                }
            }
        }
        
        return res;

    }
}
// @lc code=end

