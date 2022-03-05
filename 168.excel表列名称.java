/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */

// @lc code=start
class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            int temp=(columnNumber-1)%26+1;
            sb.append((char)(temp-1+'A'));
            columnNumber=(columnNumber-temp)/26;
        }
        return sb.reverse().toString();

    }
}
// @lc code=end

