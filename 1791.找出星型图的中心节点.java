/*
 * @lc app=leetcode.cn id=1791 lang=java
 *
 * [1791] 找出星型图的中心节点
 */

// @lc code=start
class Solution {
    public int findCenter(int[][] edges) {

        int a=edges[0][0];
        int b=edges[0][1];

        if(edges[1][0]!=a&&edges[1][1]!=a){
            return b;
        }else{
            return a;
        }

    }
}
// @lc code=end

