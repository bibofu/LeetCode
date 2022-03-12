/*
 * @lc app=leetcode.cn id=368 lang=java
 *
 * [368] 最大整除子集
 */

// @lc code=start
class Solution {
    
    public List<Integer> largestDivisibleSubset(int[] nums) {
        
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        Arrays.sort(nums);
        dp[0]=1;
        for(int i=1;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[i]%nums[j]==0){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    
                }
            }
        }
        
        int maxIndex=0;
        for(int i=1;i<n;i++){
            if(dp[i]>dp[maxIndex]){
                maxIndex=i;
            }
        }
        
        int currentCount=dp[maxIndex];
        int current=nums[maxIndex];
        List<Integer> res=new ArrayList<>();
        
        for(int i=maxIndex;i>=0;i--){
            if(dp[i]==currentCount&&current%nums[i]==0){
                res.add(nums[i]);
                currentCount--;
                current=nums[i];
            }
        }
        
        return res;
        

    }
    
}
    
//[4,8,10,240]

//[1 2 3 9] 
// @lc code=end

