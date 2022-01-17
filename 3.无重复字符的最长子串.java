/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
    
        int left=-1;
        int right=0;
        int length=s.length();
        
        int res=0;
        
        int[] freq=new int[256];
        
        while(left<=right&&right<=length-1){
            if(freq[s.charAt(right)]==0){
                freq[s.charAt(right)]=1;
                right++;
                
            }else{
                left++;
                freq[s.charAt(left)]=0;
                
            }
            
            res=Math.max(res,right-left-1);
            
            
        }
        
        return res;

    }
}
// @lc code=end

