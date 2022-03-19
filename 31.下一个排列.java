/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    
    
    public void nextPermutation(int[] nums) {

        // 1342
        int n=nums.length;
        int i=n-2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }

        if(i>=0){
            int j=n-1;
            while(j>=0&&nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);


    }

    private void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    private void reverse(int[] arr,int a,int b){
        while(a<b){
            swap(arr,a,b);
            a++;
            b--;
        }
    }

    


}
// @lc code=end

