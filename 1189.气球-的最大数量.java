/*
 * @lc app=leetcode.cn id=1189 lang=java
 *
 * [1189] “气球” 的最大数量
 */

// @lc code=start
class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int[] nums=new int[5];
        int length=text.length();
        
        for(int i=0;i<length;i++){
            char c=text.charAt(i);
            if(c=='b'){
                nums[0]++;
            }else if(c=='a'){
                nums[1]++;
            }else if(c=='l'){
                nums[2]++;
            }else if(c=='o'){
                nums[3]++;
            }else if(c=='n'){
                nums[4]++;
            }
        }
        
        nums[2]=nums[2]/2;
        nums[3]=nums[3]/2;
        
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            res=Math.min(res,nums[i]);
        }
        
        return res;
        
    }
}
// @lc code=end

