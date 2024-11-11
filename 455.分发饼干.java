/*
 * @lc app=leetcode.cn id=455 lang=java
 *
 * [455] 分发饼干
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length;
        int n = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int index = 0;
        int cur = 0;
        while(cur < m && index < n){
            if(s[index] >= g[cur]){
                index++;
                cur++;
            }else{
                index++;
            }
        }

        return cur;
    }
}
// @lc code=end

