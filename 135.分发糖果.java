/*
 * @lc app=leetcode.cn id=135 lang=java
 *
 * [135] 分发糖果
 */

// @lc code=start
class Solution {
    public int candy(int[] ratings) {
        
        int n=ratings.length;
        
        
        int[] left=new int[n];
        Arrays.fill(left,1);
        int[] right=new int[n];
        Arrays.fill(right,1);
        int res=0;
        //左到右遍历
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                left[i]=left[i-1]+1;
            }
        }
        
        //右到左遍历
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                right[i]=right[i+1]+1;
            }
        }
        
        for(int i=0;i<n;i++){
            res+=Math.max(left[i],right[i]);
        }
        
        return res;
    }
}
// @lc code=end

