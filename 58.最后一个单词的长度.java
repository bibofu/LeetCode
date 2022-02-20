/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int n=s.length();
        if(n==0){
            return 0;
        }

        int res=0;
        for(int i=n-1;i>0;i--){
            if(s.charAt(i)!=' '){
                res++;
            }else{
                break;
            }
        }

        return res;

    }
}
// @lc code=end

