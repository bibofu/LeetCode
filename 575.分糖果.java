/*
 * @lc app=leetcode.cn id=575 lang=java
 *
 * [575] 分糖果
 */

// @lc code=start
class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int temp = candyType[0];
        int n = candyType.length;
        int types=1;
        for(int i = 1;i<n;i++){
            if(candyType[i]!=temp){
                types++;
                temp = candyType[i];
            }
        }

        return Math.min(n/2,types);

    }
}
// @lc code=end

