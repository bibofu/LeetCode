/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> res=new ArrayList<>();
        if(nums.length<4){
            return res;
            
        }
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>=3;j--){
                if(i>=1&&nums[i]==nums[i-1]&&i<=j-3){
                    break;
                }
                int left=i+1;
                int right=j-1;
                if(left>=right){
                    break;
                }
                
                while(left<right){
                    if(left>=right){
                        break;
                    }
                    int temp=nums[i]+nums[j]+nums[left]+nums[right];
                    if(temp==target){
                        while(left<right-1&&nums[left+1]==nums[left]){
                            left++;
                        }
                        while(left<right-1&&nums[right]==nums[right-1]){
                            right--;
                        }
                        List<Integer> list=Arrays.asList(nums[i],nums[left],nums[right],nums[j]);
                        if(!res.contains(list)){
                            res.add(list);
                        }
                   
                        left++;
                        right--;
                    }else if(temp<target){
                        left++;
                    }else{
                        right--;
                    }
                }
                
            }
        }
        
        return res;
    }
}
// @lc code=end

