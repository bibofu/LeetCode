/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {

        int len=nums.length;
        int i;

        for(i=len-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                int swapi=i;
                for(int j=i+1;j<len;j++){
                    if(nums[j]>nums[i-1]&&nums[j]<nums[swapi]){
                        swapi=j;
                    }
                }
                swap(nums,i-1,swapi);
                break;
            }

        }
        Arrays.sort(nums,i,len);



    }

    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
// @lc code=end

