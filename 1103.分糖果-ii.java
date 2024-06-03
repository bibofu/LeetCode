/*
 * @lc app=leetcode.cn id=1103 lang=java
 *
 * [1103] 分糖果 II
 */

// @lc code=start
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int left = candies;
        for(int i=0;i<candies;i++){
            if(left >= i+1){
                res[i%num_people] += i+1;
                left = left - i -1;
            }else{
                res[i%num_people] += left;
                break;
            }
        }

        return res;
    }
}
// @lc code=end

