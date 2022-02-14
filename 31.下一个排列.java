/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {

        int length=nums.length;

        int i=length-2;
        //从右往左找到递增对，左边为目标
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=length-1;
            //从右往左找到比目标大的第一个数
            while(i<j && nums[j]<=nums[i]){
                j--;
            }
            
            //交换目标和这个数
            swap(nums,i,j);
        }
        
        reverse(nums,i+1,length-1);

    }

    private void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    private void reverse(int[] nums,int a,int b){
        while(a<b){
            swap(nums,a,b);
            a++;
            b--;
        }
    }


}
// @lc code=end

