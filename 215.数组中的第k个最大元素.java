/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {

        Queue<Integer> queue=new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            if(i<k){
                queue.offer(nums[i]);
            }else{

                if(nums[i]>queue.peek()){
                    queue.poll();
                    queue.offer(nums[i]);
                }

            }
        }

        return queue.peek();

    }
}


//快排解法
class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        
        if(nums.length==1){
            return nums[0];
        }
        int left=0;
        int n=nums.length;
        int right=n-1;
        
        while(left<=right){
            int mid=partition(nums,left,right);
            if(mid==n-k){
                return nums[mid];
            }else if(mid<n-k){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        
        return 0;

    
    
    }
    
    public int partition(int[] nums,int left,int right){
        int start=left;
        int pivot=nums[left];
        while(left<right){
            while(left<right&&nums[right]>=pivot){
                right--;
            }
            while(left<right&&nums[left]<=pivot){
                left++;
            }
            if(left>=right){
                break;
            }
            swap(nums,left,right);
        }
        swap(nums,start,left);
        return left;
    }
    
    public void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}
// @lc code=end

