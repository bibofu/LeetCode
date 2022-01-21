/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res=new ArrayList<>();
        if(nums.length<3){
            return res;
        }
        
        Arrays.sort(nums);
        
        //大胆尝试
        for(int i=0;i<nums.length-1;i++){
            if(i>=1&&nums[i]==nums[i-1]){
                continue;
            }
            
            //双指针
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int temp=nums[i]+nums[left]+nums[right];
                if(temp<0){
                    left++;
                }else if(temp>0){
                    right--;
                }else{
                    while(left<right&&nums[left]==nums[left+1]){
                        left++;
                    }
                    
                    while(left<right&&nums[right]==nums[right-1]){
                        right--;
                    }
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    
                    left++;
                    right--;
                    
                    res.add(list);
                    
                }
            }
            
            
        }
        
        return res;
        
        

    }
}
// @lc code=end

