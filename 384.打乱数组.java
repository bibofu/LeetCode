/*
 * @lc app=leetcode.cn id=384 lang=java
 *
 * [384] 打乱数组
 */

// @lc code=start
class Solution {

    int[] origin;
    Random random;

    public Solution(int[] nums) {

        this.origin=nums;
        random=new Random();

    }
    
    public int[] reset() {
        return origin;
    }
    
    public int[] shuffle() {
        
        if(origin==null){
            return null;
        }

        int[] a=origin.clone();
        for(int i=1;i<a.length;i++){
            int j=random.nextInt(i+1);
            swap(a,i,j);

        }
        return a;

    }

    public void swap(int[] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
// @lc code=end

