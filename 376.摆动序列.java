/*
 * @lc app=leetcode.cn id=376 lang=java
 *
 * [376] 摆动序列
 */

// @lc code=start
class Solution {
    public int wiggleMaxLength(int[] nums) {
        
        int n=nums.length;
        if(n==1){
            return 1;
            
        }
        int pre=nums[1]-nums[0];
        int res=1;
        if(pre!=0){
            res=res+1;
        }
        for(int i=2;i<n;i++){
            int cur=nums[i]-nums[i-1];
            
            if((cur>0&&pre<=0)||(cur<0&&pre>=0)){
                res++;
                pre=cur;
            }
        }
        
        return res;
        
        

    }
}
// @lc code=end

