/*
 * @lc app=leetcode.cn id=41 lang=java
 *
 * [41] 缺失的第一个正数
 */

// @lc code=start
class Solution {
    public int firstMissingPositive(int[] nums) {

        if(nums==null||nums.length==0){
            return 1;
        }
        int containsOne=0;
        int n=nums.length;

        //step 1
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                containsOne=1;
            }else if(nums[i]>n||nums[i]<=0){
                nums[i]=1;
            }
        }

        if(containsOne==0){
            return 1;
        }

        //step 2
        for(int i=0;i<n;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]=-1*nums[index];
            }
        }

        //step 3
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }

        return n+1;

        //案例演示: https://s4.ax1x.com/2022/02/16/HfWqHI.png


    }
}
// @lc code=end

