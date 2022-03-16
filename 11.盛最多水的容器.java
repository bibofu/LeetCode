/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
    
        //移动较小一端的指针, 注意双指针的使用场景
        int left=0;
        int right=height.length-1;
        
        int res=Math.min(height[left],height[right])*(right-left);
        
        while(left<right){
            
            if(height[left]<height[right]){
                left++;
                res=Math.max(res,Math.min(height[left],height[right])*(right-left));
            }else{
                right--;
                res=Math.max(res,Math.min(height[left],height[right])*(right-left));
            }
        }
        
        return res;

    }
}
// @lc code=end

